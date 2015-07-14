/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.controller;

import nifax.control.exception.InitializeSessionException;
import nifax.control.exception.InvalidCredentialsException;
import nifax.control.model.Employee;

import nifax.control.model.UserEmployee;
import nifax.control.model.modeler.HQLOperation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;


/**
 *
 * @author faka
 */
public class AuthenticationTest {    
    public AuthenticationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        HQLOperation op = HQLOperation.getInstance();
        UserEmployee usr = new UserEmployee(
            "f4ka", 
            "1234", 
            new Employee(
                "Facundo", 
                "Gomez Algazan", 
                "+5493816534690"
            )
        );
        op.Insert(usr);        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {                       
    }
    
    @After
    public void tearDown() {
        
    }
    @Rule
     public ExpectedException thrown= ExpectedException.none();
    /**
     * Test of initSession method, of class Authentication.
     * @throws nifax.control.exception.InvalidCredentialsException
     */
    @Test
    public void testLogIn() throws InvalidCredentialsException {
        System.out.println("LogIn works");
        Authentication instance = Authentication.getInstance();
        assertTrue(instance.LogIn(new UserEmployee("f4ka", "1234")));
    }
    
    @Test
    public void testLogInInvalid() throws InvalidCredentialsException{
        System.out.println("LogIn fails");
        Authentication instance = Authentication.getInstance();
        assertFalse(instance.LogIn(new UserEmployee("f4ka", "12345")));
    }
    
    @Test
    public void testLogOut() throws InvalidCredentialsException, InitializeSessionException {
        System.out.println("LogOut works");
        Authentication instance = Authentication.getInstance();
        instance.LogIn(new UserEmployee("f4ka", "1234"));        
        assertTrue(instance.LogOut(instance.getSession()));
        assertFalse(instance.getSession().isOpen());
    }
    
    /**
     * Test of getInstance method, of class Authentication.
     */
    @Test
    public void testGetInstance(){
        System.out.println("getInstance works");
        Authentication instance = Authentication.getInstance();
        assertNotNull(instance);
    }

    /**
     * Test of getSession method, of class Authentication.
     * @throws nifax.control.exception.InitializeSessionException
     */
   @Test
    public void testGetSession() throws InitializeSessionException {
        thrown.expect(InitializeSessionException.class);
        System.out.println("getSession fails");
        Authentication instance = Authentication.getInstance();
        instance.NullifySession();
        instance.getSession();
    }
    
}

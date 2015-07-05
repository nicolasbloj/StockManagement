/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.controller;

import nifax.control.exception.InitializeSessionException;
import nifax.control.model.Employee;

import nifax.control.model.UserEmployee;
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
    private UserEmployee usr;
    private Authentication instance;
    
    public AuthenticationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        usr = new UserEmployee(
            "f4ka", 
            "1234", 
            new Employee(
                "Facundo", 
                "Gomez Algazan", 
                "+5493816534690"
            )
        );                
    }
    
    @After
    public void tearDown() throws InitializeSessionException {
        instance.closeSession();
    }
    @Rule
     public ExpectedException thrown= ExpectedException.none();
    /**
     * Test of initSession method, of class Authentication.
     */
    @Test
    public void testInitSession() {
        System.out.println("initSession works");
        instance = Authentication.getInstance();
        instance.initSession(usr);
    }

    @Test
    public void testInitSessionInvalid() throws IllegalArgumentException{
        thrown.expect(IllegalArgumentException.class);        
        System.out.println("initSession fails");
        instance = Authentication.getInstance();
        instance.initSession(null);
    }
    
    /**
     * Test of getInstance method, of class Authentication.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance works");
        instance = Authentication.getInstance();
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
        instance = Authentication.getInstance();
        instance.getSession();
    }
    
}

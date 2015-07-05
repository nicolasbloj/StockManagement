package jcode.hibernate.model;

import nifax.control.model.Employee;
import nifax.control.model.Session;
import nifax.control.model.UserEmployee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faka
 */
public class SessionTest {
    private UserEmployee usr;
    
    public SessionTest() {
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
    public void tearDown() {
        usr = null;
    }

    /**
     * Test of getStatus method, of class Session.
     */
    @Test
    public void testisOpen() {
        System.out.println("getStatus");
        Session instance = new Session(true, usr);
        Boolean result = instance.isOpen();
        assertTrue(result);
    }

    /**
     * Test of getUser_id method, of class Session.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser");
        Session instance = new Session(true, usr);
        UserEmployee result = instance.getUser_id();
        assertNotNull(result);
    }
    
}

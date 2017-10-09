/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nifax.control.model.modeler;

import java.util.List;
import nifax.control.model.Employee;
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
public class HQLOperationTest {
    HQLOperation instance = HQLOperation.getInstance();
    Employee obj;
    public HQLOperationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        obj = new Employee(
            "TestFirstName",
            "TestLastName",
            "TestPhoneNumber"
        );
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class HQLOperation.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        HQLOperation result = HQLOperation.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of Insert method, of class HQLOperation.
     */
    @Test
    public void testInsert() {
        System.out.println("Insert");
        try {                        
            Boolean result = instance.Insert(obj);               
            assertTrue(result);
        } finally {
            instance.Delete(obj);
        }
    }

    /**
     * Test of Update method, of class HQLOperation.
     */
    @Test
    public void testUpdate() {
        System.out.println("Update");
        instance.Insert(obj);               
        Boolean result = instance.Update(obj);
        assertTrue(result);
        instance.Delete(obj);
    }

    /**
     * Test of Delete method, of class HQLOperation.
     */
    @Test
    public void testDelete() {
        System.out.println("Delete");
        instance.Insert(obj);
        Boolean result = instance.Delete(obj);
        assertTrue(result);
    }

    /**
     * Test of Select method, of class HQLOperation.
     */
    @Test
    public void testSelect() {
        System.out.println("Select");
        instance.Insert(obj);
        List a = instance.Select("from Employee where firstname = :firstname", obj);
        assertEquals(a.size(), 1);
        instance.Delete(obj);
    }
    
}

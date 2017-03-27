/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lathifah Nurrahmah
 */
public class ZooTest {
    
    public ZooTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of GetCell method, of class Zoo.
     */
    @Test
    public void testGetCell() {
        System.out.println("GetCell");
        int y = 0;
        int x = 0;
        Zoo instance = new Zoo();
        Cell expResult = null;
        Cell result = instance.GetCell(y, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetPanjang method, of class Zoo.
     */
    @Test
    public void testGetPanjang() {
        System.out.println("GetPanjang");
        Zoo instance = new Zoo();
        int expResult = 0;
        int result = instance.GetPanjang();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetLebar method, of class Zoo.
     */
    @Test
    public void testGetLebar() {
        System.out.println("GetLebar");
        Zoo instance = new Zoo();
        int expResult = 0;
        int result = instance.GetLebar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEntL method, of class Zoo.
     */
    @Test
    public void testGetEntL() {
        System.out.println("GetEntL");
        Zoo instance = new Zoo();
        int expResult = 0;
        int result = instance.GetEntL();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of GetEntP method, of class Zoo.
     */
    @Test
    public void testGetEntP() {
        System.out.println("GetEntP");
        Zoo instance = new Zoo();
        int expResult = 0;
        int result = instance.GetEntP();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IsRoute method, of class Zoo.
     */
    @Test
    public void testIsRoute() {
        System.out.println("IsRoute");
        int y = 0;
        int x = 0;
        Zoo instance = new Zoo();
        boolean expResult = false;
        boolean result = instance.IsRoute(y, x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CheckAround method, of class Zoo.
     */
    @Test
    public void testCheckAround() {
        System.out.println("CheckAround");
        int y = 0;
        int x = 0;
        Zoo instance = new Zoo();
        instance.CheckAround(y, x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

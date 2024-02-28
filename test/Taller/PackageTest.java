/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Taller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danie
 */
public class PackageTest {
    
    public PackageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Package.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Package instance = null;
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Package.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Package instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Package.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Package instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Package.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Package instance = null;
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCode method, of class Package.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Package instance = null;
        int expResult = 0;
        int result = instance.getCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCode method, of class Package.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        int code = 0;
        Package instance = null;
        instance.setCode(code);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGramsPrice method, of class Package.
     */
    @Test
    public void testGetGramsPrice() {
        System.out.println("getGramsPrice");
        Package instance = null;
        float expResult = 0.0F;
        float result = instance.getGramsPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGramsPrice method, of class Package.
     */
    @Test
    public void testSetGramsPrice() {
        System.out.println("setGramsPrice");
        float gramsPrice = 0.0F;
        Package instance = null;
        instance.setGramsPrice(gramsPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBasePrice method, of class Package.
     */
    @Test
    public void testGetBasePrice() {
        System.out.println("getBasePrice");
        Package instance = null;
        float expResult = 0.0F;
        float result = instance.getBasePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBasePrice method, of class Package.
     */
    @Test
    public void testSetBasePrice() {
        System.out.println("setBasePrice");
        float basePrice = 0.0F;
        Package instance = null;
        instance.setBasePrice(basePrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWeight method, of class Package.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Package instance = null;
        float expResult = 0.0F;
        float result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWeight method, of class Package.
     */
    @Test
    public void testSetWeight() {
        System.out.println("setWeight");
        float weight = 0.0F;
        Package instance = null;
        instance.setWeight(weight);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomer method, of class Package.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        Package instance = null;
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class Package.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        Package instance = null;
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Package.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Package instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class Package.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        float a = 0.0F;
        float b = 0.0F;
        Package instance = null;
        float expResult = 0.0F;
        float result = instance.calculate(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PackageImpl extends Package {

        public PackageImpl() {
            super("", "", 0, 0.0F, 0.0F, 0.0F, null);
        }
    }
    
}

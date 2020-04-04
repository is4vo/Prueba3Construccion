/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionclubdetenis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isavo
 */
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of anadirMulta method, of class Cliente.
     */
    @Test
    public void testAnadirMulta() {
        System.out.println("anadirMulta");
        int multa = 0;
        Cliente instance = new Cliente();
        instance.anadirMulta(multa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagarDeuda method, of class Cliente.
     */
    @Test
    public void testPagarDeuda() {
        System.out.println("pagarDeuda");
        Cliente instance = new Cliente();
        instance.pagarDeuda();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

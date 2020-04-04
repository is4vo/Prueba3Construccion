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
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of calcularCosto method, of class Reserva.
     */
    @Test
    public void testCalcularCosto() {
        System.out.println("calcularCosto");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.calcularCosto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Reserva.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Reserva instance = new Reserva();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Reserva.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Reserva instance = new Reserva();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHorario method, of class Reserva.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Reserva instance = new Reserva();
        String expResult = "";
        String result = instance.getHorario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHorario method, of class Reserva.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "";
        Reserva instance = new Reserva();
        instance.setHorario(horario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCosto method, of class Reserva.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.getCosto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCosto method, of class Reserva.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 0;
        Reserva instance = new Reserva();
        instance.setCosto(costo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPista method, of class Reserva.
     */
    @Test
    public void testGetPista() {
        System.out.println("getPista");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.getPista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPista method, of class Reserva.
     */
    @Test
    public void testSetPista() {
        System.out.println("setPista");
        int pista = 0;
        Reserva instance = new Reserva();
        instance.setPista(pista);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

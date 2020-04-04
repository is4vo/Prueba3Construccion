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
public class GestionClubDeTenisTest {
    
    public GestionClubDeTenisTest() {
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
     * Test of main method, of class GestionClubDeTenis.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GestionClubDeTenis.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of menu method, of class GestionClubDeTenis.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        GestionClubDeTenis instance = new GestionClubDeTenis();
        instance.menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarIdentidad method, of class GestionClubDeTenis.
     */
    @Test
    public void testConfirmarIdentidad() {
        System.out.println("confirmarIdentidad");
        String confirmacion = "";
        GestionClubDeTenis instance = new GestionClubDeTenis();
        boolean expResult = false;
        boolean result = instance.confirmarIdentidad(confirmacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDisponibilidad method, of class GestionClubDeTenis.
     */
    @Test
    public void testVerificarDisponibilidad() {
        System.out.println("verificarDisponibilidad");
        int pista = 0;
        String horario = "";
        GestionClubDeTenis instance = new GestionClubDeTenis();
        boolean expResult = false;
        boolean result = instance.verificarDisponibilidad(pista, horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

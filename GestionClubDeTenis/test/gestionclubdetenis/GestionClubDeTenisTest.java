/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionclubdetenis;

import java.util.ArrayList;
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
        
    }

    /**
     * Test of menu method, of class GestionClubDeTenis.
     */
    @Test
    public void testMenu() {
        System.out.println("menu");
        GestionClubDeTenis instance = new GestionClubDeTenis();
        instance.menu();
        //Metodo que solo imprime asi que no puede probarse
    }

    /**
     * Test of confirmarIdentidad method, of class GestionClubDeTenis.
     */
    @Test
    public void testConfirmarIdentidad() {
        System.out.println("confirmarIdentidad");
        String confirmacion = "No";
        GestionClubDeTenis instance = new GestionClubDeTenis();
        boolean expResult = false;
        boolean result = instance.confirmarIdentidad(confirmacion);
        assertEquals(expResult, result);
    }

    /**
     * Test of verificarDisponibilidad method, of class GestionClubDeTenis.
     */
    @Test
    public void testVerificarDisponibilidad() {
        System.out.println("verificarDisponibilidad");
        int pista = 1;
        String horario = "17:00";
        String dia = "Martes";
        GestionClubDeTenis instance = new GestionClubDeTenis();
        boolean expResult = false;
        boolean result = instance.verificarDisponibilidad(pista, horario, dia);
        assertEquals(expResult, result);
    }

    /**
     * Test of getReservasRealizadas method, of class GestionClubDeTenis.
     */
    @Test
    public void testGetReservasRealizadas() {
        System.out.println("getReservasRealizadas");
        GestionClubDeTenis instance = new GestionClubDeTenis();
        ArrayList<Reserva> expResult = null;
        ArrayList<Reserva> result = instance.getReservasRealizadas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setReservasRealizadas method, of class GestionClubDeTenis.
     */
    @Test
    public void testSetReservasRealizadas() {
        System.out.println("setReservasRealizadas");
        ArrayList<Reserva> reservasRealizadas = null;
        GestionClubDeTenis instance = new GestionClubDeTenis();
        instance.setReservasRealizadas(reservasRealizadas);
        ArrayList<Reserva> resultado = instance.getReservasRealizadas();
        assertEquals(reservasRealizadas, resultado);
    }

    /**
     * Test of getSociosRegistrados method, of class GestionClubDeTenis.
     */
    @Test
    public void testGetSociosRegistrados() {
        System.out.println("getSociosRegistrados");
        GestionClubDeTenis instance = new GestionClubDeTenis();
        ArrayList<Cliente> expResult = null;
        ArrayList<Cliente> result = instance.getSociosRegistrados();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSociosRegistrados method, of class GestionClubDeTenis.
     */
    @Test
    public void testSetSociosRegistrados() {
        System.out.println("setSociosRegistrados");
        ArrayList<Cliente> sociosRegistrados = null;
        GestionClubDeTenis instance = new GestionClubDeTenis();
        instance.setSociosRegistrados(sociosRegistrados);
        ArrayList<Cliente> resultado = instance.getSociosRegistrados();
        assertEquals(sociosRegistrados, resultado);
    }
    
}

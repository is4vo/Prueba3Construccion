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
        Reserva instance = new Reserva ("Lunes", "17:00", null, 0);
        int expResult = 5000;
        int result = instance.calcularCosto();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCliente method, of class Reserva.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Cliente cliente = new Cliente ("12345678-9");
        Reserva instance = new Reserva (null, null, cliente, 0);
        Cliente expResult = cliente;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCliente method, of class Reserva.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = new Cliente ("12345678-9");
        Reserva instance = new Reserva(null, null, null, 0);
        instance.setCliente(cliente);
        Cliente expResult = cliente;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
    }

    /**
     * Test of getHorario method, of class Reserva.
     */
    @Test
    public void testGetHorario() {
        System.out.println("getHorario");
        Reserva instance = new Reserva(null, "16:00", null, 0);
        String expResult = "16:00";
        String result = instance.getHorario();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHorario method, of class Reserva.
     */
    @Test
    public void testSetHorario() {
        System.out.println("setHorario");
        String horario = "16:00";
        Reserva instance = new Reserva(null,null,null,0);
        instance.setHorario(horario);
        String result = instance.getHorario();
        assertEquals(horario, result);
    }

    /**
     * Test of getCosto method, of class Reserva.
     */
    @Test
    public void testGetCosto() {
        System.out.println("getCosto");
        Reserva instance = new Reserva("Lunes","17:00",null,0);
        int expResult = 5000;
        int result = instance.getCosto();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCosto method, of class Reserva.
     */
    @Test
    public void testSetCosto() {
        System.out.println("setCosto");
        int costo = 5000;
        Reserva instance = new Reserva(null,null,null,0);
        instance.setCosto(costo);
        int result = instance.getCosto();
        assertEquals(costo,result);
    }

    /**
     * Test of getPista method, of class Reserva.
     */
    @Test
    public void testGetPista() {
        System.out.println("getPista");
        Reserva instance = new Reserva(null,null,null,1);
        int expResult = 1;
        int result = instance.getPista();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPista method, of class Reserva.
     */
    @Test
    public void testSetPista() {
        System.out.println("setPista");
        int pista = 1;
        Reserva instance = new Reserva(null,null,null,0);
        instance.setPista(pista);
        int result = instance.getPista();
        assertEquals(pista, result);
    }
    
}

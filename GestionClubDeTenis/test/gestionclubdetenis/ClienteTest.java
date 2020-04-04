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
        Cliente instance = new Cliente(null);
        int multa = 100;
        instance.setMulta(100); //multa anterior
        instance.anadirMulta(multa);
        int resultadoEsperado = 200;
        int resultadoObtenido = instance.getMulta();
        assertEquals(resultadoEsperado,resultadoObtenido);
    }

    /**
     * Test of pagarDeuda method, of class Cliente.
     */
    @Test
    public void testPagarDeuda() {
        System.out.println("pagarDeuda");
        Cliente instance = new Cliente(null);
        instance.pagarDeuda();
        int resultadoEsperado = 0;
        int resultadoObtenido = instance.getMulta();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of getRut method, of class Cliente.
     */
    @Test
    public void testGetRut() {
        System.out.println("getRut");
        Cliente instance = new Cliente("12345678-9");
        String resultadoEsperado = "12345678-9";
        String resultadoObtenido = instance.getRut();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of setRut method, of class Cliente.
     */
    @Test
    public void testSetRut() {
        System.out.println("setRut");
        Cliente instance = new Cliente(null);
        instance.setRut("12345678-9");
        String resultadoEsperado = "12345678-9";
        String resultadoObtenido = instance.getRut();
        assertEquals(resultadoEsperado, resultadoObtenido);
        
    }

    /**
     * Test of getMulta method, of class Cliente.
     */
    @Test
    public void testGetMulta() {
        System.out.println("getMulta");
        Cliente instance = new Cliente(null);
        instance.setMulta(100);
        int resultadoEsperado = 100;
        int resultadoObtenido = instance.getMulta();
        assertEquals(resultadoEsperado, resultadoObtenido);
        
    }

    /**
     * Test of setMulta method, of class Cliente.
     */
    @Test
    public void testSetMulta() {
        System.out.println("setMulta");
        Cliente instance = new Cliente(null);
        instance.setMulta(100);
        int resultadoEsperado = 100;
        int resultadoObtenido = instance.getMulta();
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    /**
     * Test of isMensualidadPagada method, of class Cliente.
     */
    @Test
    public void testIsMensualidadPagada() {
        System.out.println("isMensualidadPagada");
        Cliente instance = new Cliente(null);
        instance.setMensualidadPagada(true);
        boolean resultadoObtenido = instance.isMensualidadPagada();
        assertTrue(resultadoObtenido);
    }

    /**
     * Test of setMensualidadPagada method, of class Cliente.
     */
    @Test
    public void testSetMensualidadPagada() {
        System.out.println("setMensualidadPagada");
        Cliente instance = new Cliente(null);
        instance.setMensualidadPagada(false);
        boolean resultadoObtenido = instance.isMensualidadPagada();
        assertFalse(resultadoObtenido);
    }
    
}

package com.curso.testsunitarios.calculadora;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    public Calculadora calculadoraNull;
    public Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
//        System.out.println("Se ha ejecutado el test setUp()");
    }

    @After
    public void tearDown(){
        calculadora = null;
//        System.out.println("Se ha ejecutado el test tearDown()");
    }

    @Test
    public void calculadoraNotNullTest(){
        Assert.assertNotNull("Calculadora debe ser not null", calculadora);
        System.out.println("Se ha ejecutado el test calculadoraNotNullTest()");
    }

    @Test
    public void calculadoraNullTest(){
         Assert.assertNull("Calculadora debe ser null", calculadoraNull);
         System.out.println("Se ha ejecutado el test calculadoraNullTest()");
    }

    @Test
    public void sumarTestExplicado(){
        //Setup
        Calculadora calculadoraPrueba = new Calculadora();
        int resultadoEsperado = 30;
        int resultadoAcutal;
        //Acción
        resultadoAcutal = calculadoraPrueba.sumar(10, 20);
        //Assert
        assertEquals(resultadoEsperado, resultadoAcutal);
        System.out.println("Se ha ejecutado el test sumarTestExplicado()");

    }

    @Test
    public void sumarTest() {
        assertEquals(30, calculadora.sumar(10,20));
        System.out.println("Se ha ejecutado el test sumarTest()");
    }

    @Test
    public void ejemploAssert(){
        assertTrue(1==1);
        assertFalse(1==2);

//        assertNull(calculadora);
        assertNotNull(calculadora);

        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2 = new Calculadora();
        Calculadora calculadora3 = calculadora1;

//        assertSame(calculadora1, calculadora2);
        assertSame(calculadora1, calculadora3);
        assertNotSame(calculadora1,calculadora2);

        assertEquals("a", "a");
//        assertEquals("Esto es una prueba AssertEquals con error fa no es a", "Fa", "a");

        assertEquals(1, 1.4, 0.5);

//        fail("Fallo detectado Manualmente");
    }

    @Test
    public void sumar() throws Exception{
        //Setup
        int a = 10;
        int b = 20;
        int resultadoEsperado = 30;
        int resultado;
        //Acción
        resultado = calculadora.sumar(a,b);
        assertEquals(resultadoEsperado, resultado);
        System.out.println("Se ha ejecutado el test sumar()");
    }

    @Test
    public void sumar_ValidInput_ValidExpected_Test(){
        assertEquals(11, calculadora.sumar(7,4));
        System.out.println("Se ha ejecutado el test sumar_ValidInput_ValidExpected_Test()");
    }

    @Test
    public void restar_ValidInput_ValidExpected_Test() throws Exception {
        assertEquals(3, calculadora.restar(7, 4));
        System.out.println("Se ha ejecutado el test restar_ValidInput_ValidExpected_Test()");
    }

    @Test
    public void restar_ValidInput_ValidNegativeExpected_Test() throws Exception {
        assertEquals(-10, calculadora.restar(10, 20));
        System.out.println("Se ha ejecutado el test restar_ValidInput_ValidNegativeExpected_Test()");
    }

    @Test
    public void dividir_ValidInput_ValidResultExpected_Test() {
        assertEquals(2, calculadora.dividir(4,2));
        System.out.println("Se ha ejecutado el test dividir_ValidInput_ValidResultExpected_Test()");
    }

    @Test
    public void dividir_NotValidInput_ValidResultExpected_Test(){
        calculadora.dividir(5,0);
        System.out.println("Se ha ejecutado el test dividir_NotValidInput_ValidResultExpected_Test()");
        fail("Fallo detectado manualmente: no se puede dividir por 0");
    }

    @Test(expected = ArithmeticException.class)
    public void dividirPorCero_NotValidInput_ExcpetedException_Test(){
        calculadora.dividirPorCero(5,0);
        System.out.println("Se ha ejecutado el test dividirPorCero_NotValidInput_ExcpetedException_Test()");
    }

    @Test(timeout = 1200)
    public void operacionLargaDuracion_TimeOut_Test(){
        calculadora.operacionLargaDuracion();
    }

    @Ignore("Método no listo. Ignorar por ahora. Esperando a solucionar la división por cero")
    @Test
    public void dividir_NotValidInput_Ignore_Test(){
        assertEquals(2,calculadora.dividir(5,0));
        System.out.println("Se ha ejecutado el test dividir_NotValidInput_Ignore_Test()");
    }
}
package com.curso.testsunitarios;

import com.curso.testsunitarios.calculadora.Calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTestBeforeClass {

    private static Calculadora calculadoraBefore;
    private static Calculadora calculadoraBeforeClass;

    private static int numeroBefore;
    private static int numeroBeforeClass;

    @BeforeClass
    public static void beforeClass(){
        calculadoraBeforeClass = new Calculadora();
        numeroBeforeClass = 3;
        System.out.println("Se ha realizado el beforeClass()");
    }

    @Before
    public void before(){
        calculadoraBefore = new Calculadora();
        numeroBefore = 3;
        System.out.println("Se ha realizado el before()");
    }

    @Test
    public void pruebaBeforeVsBeforeClass(){
        numeroBeforeClass = numeroBeforeClass + 3;
        numeroBefore = numeroBefore + 3;
        assertEquals("numeroBeforeClass: ", 6, numeroBeforeClass);
        assertEquals("numeroBefore: ", 6, numeroBefore);
        System.out.println("Se ha realizado el pruebaBeforeVsBeforeClass()");
    }

    @Test
    public void pruebaBeforeVsBeforeClass2(){
        numeroBeforeClass = numeroBeforeClass + 3;
        numeroBefore = numeroBefore + 3;
        assertEquals("numeroBeforeClass: ", 9, numeroBeforeClass);
        assertEquals("numeroBefore: ", 6, numeroBefore);
        System.out.println("Se ha realizado el pruebaBeforeVsBeforeClass2()");
    }

    @AfterClass
    public static void afterClass(){
        calculadoraBeforeClass = null;
        numeroBeforeClass = 0;
        System.out.println("Se ha realizado afterClass()");
    }

    @After
    public void after(){
        calculadoraBefore = null;
        numeroBefore = 0;
        System.out.println("Se ha realizado after()");

    }

}

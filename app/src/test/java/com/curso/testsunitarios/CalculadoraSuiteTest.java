package com.curso.testsunitarios;

import com.curso.testsunitarios.calculadora.Calculadora;
import com.curso.testsunitarios.calculadora.CalculadoraTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses({
        CalculadoraParametrizadaTest.class,
        CalculadoraTest.class
})
public class CalculadoraSuiteTest {}

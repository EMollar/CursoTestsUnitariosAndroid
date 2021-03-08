package com.curso.testsunitarios.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void of_0is0(){
        Assert.assertEquals("0", fizzBuzz.of(0));
    }

    @Test
    public void of_1is1(){
        Assert.assertEquals("1", fizzBuzz.of(1));
    }

    @Test
    public void of_2is2(){
        Assert.assertEquals("2", fizzBuzz.of(2));
    }

    @Test
    public void of_3isFizz(){
        Assert.assertEquals("Fizz", fizzBuzz.of(3));
    }

    @Test
    public void of_5isBuzz(){
        Assert.assertEquals("Buzz", fizzBuzz.of(5));
    }

    @Test
    public void of_6isFizz(){
        Assert.assertEquals("Fizz", fizzBuzz.of(6));
    }

    @Test
    public void of_10isBuzz(){
        Assert.assertEquals("Buzz", fizzBuzz.of(10));
    }

    @Test
    public void of_15isFizzBuzz(){
        Assert.assertEquals("FizzBuzz", fizzBuzz.of(15));
    }

    @Test
    public void of_100isBuzz(){
        Assert.assertEquals("Buzz", fizzBuzz.of(100));
    }
}
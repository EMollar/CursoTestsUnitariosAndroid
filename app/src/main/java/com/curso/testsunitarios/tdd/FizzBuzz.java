package com.curso.testsunitarios.tdd;

public class FizzBuzz {

    public String of(int numero){
        if(numero == 0){
            return "0";
        }

        String texto = "";

        if(numero % 3 == 0){
            texto += "Fizz";
        }

        if(numero % 5 == 0){
            texto += "Buzz";
        }

        return texto.isEmpty() ? String.valueOf(numero) : texto;
    }
}

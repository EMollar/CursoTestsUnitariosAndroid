package com.curso.testsunitarios.calculadora;

public class Calculadora {

    private int resultado;

    public int sumar (int numero1, int numero2){
        resultado = numero1 + numero2;
        return resultado;
    }

    public int restar (int numero1, int numero2){
        resultado = numero1 - numero2;
        return resultado;
    }

    public int dividir(int numero1, int numero2){
        if(numero2==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        resultado = numero1 / numero2;
        return resultado;
    }

    public int dividirPorCero(int numero1, int numero2){
        if(numero2==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        resultado = numero1 / numero2;
        return resultado;
    }

    public void operacionLargaDuracion(){
        try{
            Thread.sleep(1000);
        } catch (Exception ignored){}
    }

}

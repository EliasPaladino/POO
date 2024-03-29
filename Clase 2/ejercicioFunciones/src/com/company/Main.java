package com.company;

import java.util.Scanner;

public class Main {
    private static String[] args;

    public static void main(String[] args) {
        Main.args = args;
        //Ejercicio 1
        //Hacer una función que dado un número indica si es un número primo o no. Un número
        //primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
        //ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
        //17.
        //Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
        //función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
        //obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
        //divisor)

        public static String esPrimo ( int numero){
            if (numero % 2 == 0 && numero % numero == 0) {
                return "Es primo";
            } else {
                return numero;
            }
        }

        String resultado;

        Scanner scanner = new Scanner(System.in);
        System.out.println();
    }
}

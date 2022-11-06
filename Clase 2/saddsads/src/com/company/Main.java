package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Desafío 1
        //Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
        //aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
        //en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
        //una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
        //devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
        //cuando el primero elije “*” como indicador de final.

        juego();
    }

    public static void juego() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1, ingrese su nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.println("Jugador 2, ingrese su nombre: ");
        String nombre2 = scanner.nextLine();

        String eleccionJugador1;
        String eleccionJugador2;

        for(;;) {
            System.out.println("Jugador 1, ingrese 1 para piedra, 2 para papel, 3 para tijera o 4 para Spock");
            eleccionJugador1 = scanner.nextLine();

            System.out.println("Jugador 2, ingrese 1 para piedra, 2 para papel, 3 para tijera o 4 para Spock");
            eleccionJugador2 = scanner.nextLine();

            if(eleccionJugador1.equals("*") || eleccionJugador2.equals("*")) {
                return;
            }
            System.out.println(cualGana(eleccionJugador1, eleccionJugador2));
        }
    }

    public static int cualGana(String numero1, String numero2) {
        if(numero1.equals(numero2)) {
            return 0;
        } else if((numero1.equals("1") && numero2.equals("3")) || (numero1.equals("2") && numero2.equals("1")) || (numero1.equals("3") && numero2.equals("2")) || (numero1.equals("2") && numero2.equals("4"))|| (numero1.equals("4") && numero2.equals("1")) || (numero1.equals("4") && numero2.equals("3"))) {
            return 1;
        } else {
            return 2;
        }
    }

}

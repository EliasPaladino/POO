package com.company;

public class Main {

    public static void main(String[] args) {
        Policia roberto = new Policia("Roberto", "Caceres", "A123");

        Corta bersa = new Corta(roberto, 23, 202.0, "Bersa", 9, "EN USO", true);

        System.out.println(bersa.sePuedeUsar());

        Larga m4 = new Larga(roberto, 49, 1200.0, "Alcon", 42, "En uso", true, "Carabina de larga distancia", 2);
        Larga m4A = new Larga(roberto, 49, 1200.0, "Alcon", 42, "En uso", true, "Carabina de larga distancia", 3);

        System.out.println(m4A.compareTo(m4));

        System.out.println(bersa.puedeDispararA200mts());

    }
}

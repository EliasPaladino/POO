package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mascota unaMascota = new Mascota("firulais",5);
        Mascota otraMascota = new Mascota("mimi",5);

        Persona persona = new Persona("Pepe",new Mascota("pedro",2));

        Paseador paseador = new Paseador("Roberto");

        paseador.pasearMascota(unaMascota);
    }
}

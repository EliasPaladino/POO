package com.company;

public class Paseador {

    private String nombre;

    public Paseador(String nombre) {
        this.nombre = nombre;
    }

    public void pasearMascota(Mascota mascota){
        System.out.println("soy " + nombre + " y estoy paseando a " + mascota.getNombre());
    }
}

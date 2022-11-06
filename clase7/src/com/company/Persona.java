package com.company;

public class Persona {

    private String nombre;
    private Mascota mascota;

    public Persona(String nombre, Mascota mascota) {
        this.nombre = nombre;
        this.mascota = mascota;
    }


    public Mascota getMascota() {
        return mascota;
    }
}

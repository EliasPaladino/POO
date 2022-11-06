package com.company;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;//no se opera el DNI, ninguna operación matemática
    private Integer edad;

    public Persona(String nombre, String apellido, String dni, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }
}

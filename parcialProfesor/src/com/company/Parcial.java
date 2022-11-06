package com.company;

public class Parcial extends Examen {
    private Integer numeroUnidad;
    private Integer cantidadReintentos;

    public Parcial(Alumno alumno, String enunciado, String titulo, Double nota, Integer numeroUnidad, Integer cantidadReintentos) {
        super(alumno, enunciado, titulo, nota);
        this.numeroUnidad = numeroUnidad;
        this.cantidadReintentos = cantidadReintentos;
    }

    public void asignarIntentos(){
        if(numeroUnidad <= 3) {
            cantidadReintentos = 3;
        } else {
            cantidadReintentos = 2;
        }
    }

    public Boolean seguirRecuperando() {
        if(cantidadReintentos > 0) {
                cantidadReintentos--;
                return true;
        } else {
            return false;
        }
    }
}

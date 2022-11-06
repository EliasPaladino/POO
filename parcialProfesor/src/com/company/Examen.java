package com.company;

public abstract class Examen {
    private Alumno alumno;
    private String enunciado;
    private String titulo;
    private Double nota;

    public Examen(Alumno alumno, String enunciado, String titulo, Double nota) {
        this.alumno = alumno;
        this.enunciado = enunciado;
        this.titulo = titulo;
        this.nota = nota;
    }

    public Boolean estaAprobado() {
        if(nota >= 4) {
            return true;
        } else {
            return false;
        }
    }

    public Double getNota() {
        return nota;
    }
}

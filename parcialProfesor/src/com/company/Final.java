package com.company;

public class Final extends Examen implements Comparable {
    private Double notaOral;
    private String descripcionTema;

    public Final(Alumno alumno, String enunciado, String titulo, Double nota, Double notaOral, String descripcionTema) {
        super(alumno, enunciado, titulo, nota);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }


    @Override
    public int compareTo(Object o) {
        Final otroFinal = (Final) o;

        Double promedio = (notaOral + getNota())/2;
        Double promedio2 = (otroFinal.notaOral + otroFinal.getNota())/2;

        if(promedio > promedio2 ) {
            return 1;
        } else if ( promedio < promedio2) {
            return -1;
        } else {
            return 0;
        }
    }
}

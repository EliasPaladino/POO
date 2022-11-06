package com.company;

public class Larga extends Arma implements Comparable{
    private Boolean sellado;
    private String descripcion;
    private Integer nivel;

    public Larga(Policia policia, Integer cantidadMuniciones, Double alcanceAprox, String marca, Integer calibre, String estado, Boolean sellado, String descripcion, Integer nivel) {
        super(policia, cantidadMuniciones, alcanceAprox, marca, calibre, estado);
        this.sellado = sellado;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    @Override
    public int compareTo(Object o) {
        Larga otraArmaLarga = (Larga) o;

        return (nivel - otraArmaLarga.nivel);
    }
}

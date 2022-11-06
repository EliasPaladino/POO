package com.company;

import java.util.Locale;

public abstract class Arma {
    private Policia policia;
    private Integer cantidadMuniciones;
    private Double alcanceAprox;
    private String marca;
    private Integer calibre;
    private String estado;

    public Arma(Policia policia, Integer cantidadMuniciones, Double alcanceAprox, String marca, Integer calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceAprox = alcanceAprox;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public Boolean sePuedeUsar() {
        if(estado.toUpperCase().equals("EN USO") && calibre >= 9) {
            return true;
        } else {
            return false;
        }
    }

    public Double getAlcanceAprox() {
        return alcanceAprox;
    }
}

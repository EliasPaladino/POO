package com.company;

public class Corta extends Arma{
    private Boolean automatica;

    public Corta(Policia policia, Integer cantidadMuniciones, Double alcanceAprox, String marca, Integer calibre, String estado, Boolean automatica) {
        super(policia, cantidadMuniciones, alcanceAprox, marca, calibre, estado);
        this.automatica = automatica;
    }

    public Boolean puedeDispararA200mts() {
        if(getAlcanceAprox() > 200.0) {
            return true;
        } else {
            return false;
        }
    }
}

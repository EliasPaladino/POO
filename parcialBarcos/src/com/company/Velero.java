package com.company;

public class Velero extends Embarcacion {

    private Integer cantidadMastiles;

    public Velero(Capitan capitan, Double valorBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadMastiles) {
        super(capitan, valorBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Boolean esGrande() {
        return cantidadMastiles > 4;
    }
}

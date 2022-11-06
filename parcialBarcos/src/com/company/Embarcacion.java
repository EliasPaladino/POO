package com.company;

public abstract class Embarcacion {
    private Capitan capitan;
    private Double valorBase;
    private Double valorAdicional;
    private Integer anioFabricacion;
    private Double eslora;

    public Embarcacion(Capitan capitan, Double valorBase, Double valorAdicional, Integer anioFabricacion, Double eslora) {
        this.capitan = capitan;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
    }

    public Double calcularMontoAlquiler() {
        Double valorFinal = valorBase;

        if(anioFabricacion > 2020) {
            valorFinal += valorAdicional;
        }

        return valorFinal;
    }
}

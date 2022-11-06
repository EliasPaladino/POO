package com.company;
import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad {
    private Integer factorMultiplicador;
    private List<Propiedad> propiedades;

    public BarrioCerrado(String calle, Integer numero, Integer factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        this.propiedades = new ArrayList<>();
    }

    @Override
    public Double calcularImpuesto() {
        Double impuesto = 0.0;

        for (Propiedad propiedades : propiedades) {
            impuesto += propiedades.calcularImpuesto();
        }

        return impuesto * getFactorMultiplicador();
    }

    public void addPropiedad(Propiedad prop) {
        propiedades.add(prop);
    }

    public Integer getFactorMultiplicador() {
        return factorMultiplicador;
    }

    @Override
    public String toString() {
        return "Barrio cerrado: sobre la calle " + getCalle() + " al " + getNumero() + " que tiene un factor multiplicador de "
        + getFactorMultiplicador() +" y contiene las anteriores " + propiedades.size() + " propiedades tiene un impuesto de " + calcularImpuesto() + " pesos.";
    }
}

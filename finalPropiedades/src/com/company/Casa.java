package com.company;

public class Casa extends Propiedad {
    private Double impuesto;

    public Casa(String calle, Integer numero, Double impuesto) {
        super(calle, numero);
        this.impuesto = impuesto;
    }


    @Override
    public Double calcularImpuesto() {
        if(getCalle().equals("Av. San Martín")) {
            return getImpuesto() * 1.1;
        }
        return getImpuesto();
    }

    public Double getImpuesto() {
        return this.impuesto;
    }

    @Override
    public String toString() {
        return "Casa: sobre la calle " + getCalle() + " al " +getNumero() + " tiene un impuesto base de " +getImpuesto()+" pesos, es\n" +
                "decir, un impuesto de "+ calcularImpuesto()+ "pesos.";
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica{

    private List<OfertaAcademica> ofertasAcademicas;
    private Double descuento;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOferta(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

    @Override
    public Double calcularPrecio() {
        Double sumaPrecio = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            sumaPrecio += ofertaAcademica.calcularPrecio();
        }
        return sumaPrecio - sumaPrecio*descuento;
    }
}

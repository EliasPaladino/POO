package com.company;

import java.util.Date;

public class ContratoPorHoras extends Contrato implements Comparable {
    private Integer cantidadHorasContratadas;
    private Double valorHora;
    //private Double a = (double) 10;


    public ContratoPorHoras(Persona persona, Integer cantidadMesesDuracion, Date fechaInicioActividad, Boolean selladoMinisterio, Integer cantidadHorasContratadas, Double valorHora) {
        super(persona, cantidadMesesDuracion, fechaInicioActividad, selladoMinisterio);
        this.cantidadHorasContratadas = cantidadHorasContratadas;
        this.valorHora = valorHora;
    }

    @Override
    public int compareTo(Object objetito) {
        ContratoPorHoras contrato = (ContratoPorHoras) objetito;
        return this.cantidadHorasContratadas - contrato.cantidadHorasContratadas;
        /*if(this.cantidadHorasContratadas > contrato.cantidadHorasContratadas){
            return 1;
        }else if (this.cantidadHorasContratadas < contrato.cantidadHorasContratadas){
            return -1;
        }else{
            return 0;
        }*/
    }
}

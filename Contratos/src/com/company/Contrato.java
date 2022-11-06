package com.company;

import java.util.Date;

public abstract class Contrato {
    private Persona persona;
    private Integer cantidadMesesDuracion;
    private Date fechaInicioActividad;
    private Boolean selladoMinisterio;

    public Contrato(Persona persona, Integer cantidadMesesDuracion, Date fechaInicioActividad, Boolean selladoMinisterio) {
        this.persona = persona;
        this.cantidadMesesDuracion = cantidadMesesDuracion;
        this.fechaInicioActividad = fechaInicioActividad;
        this.selladoMinisterio = selladoMinisterio;
    }

    public Boolean incorporarTrabajo(){
        return this.selladoMinisterio;
    }
}

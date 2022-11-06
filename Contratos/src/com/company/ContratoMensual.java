package com.company;

import java.util.Date;
import java.util.Locale;

public class ContratoMensual extends Contrato {
    private Double salarioMensual;
    private Integer horasTotales;
    private String cargo;

    public ContratoMensual(Persona persona, Integer cantidadMesesDuracion, Date fechaInicioActividad, Boolean selladoMinisterio, Double salarioMensual, Integer horasTotales, String cargo) {
        super(persona, cantidadMesesDuracion, fechaInicioActividad, selladoMinisterio);
        this.salarioMensual = salarioMensual;
        this.horasTotales = horasTotales;
        this.cargo = cargo;
    }

    public Boolean cargoJefe(){
        if(cargo.toLowerCase().equals("jefe")){
            return true;
        }
        return false;
    }
}

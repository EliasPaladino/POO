package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Persona juanito = new Persona("Juanito","Perez","0101",23);
        //El date sale tachado porque ahora es Calendar
        ContratoMensual contratoMensual = new ContratoMensual(juanito,2, new Date(121,8,3),true,232.3,23,"JEFE");

        ContratoPorHoras contratoHora = new ContratoPorHoras(juanito,4,new Date(122,4,12), false, 89,17.5);
        ContratoPorHoras contratoHora1 = new ContratoPorHoras(juanito,4,new Date(122,4,12), true, 89,17.5);
        System.out.println(contratoMensual.cargoJefe());
        System.out.println(contratoMensual.incorporarTrabajo());
        System.out.println(contratoHora.compareTo(contratoHora1));
        System.out.println(contratoHora.incorporarTrabajo());
    }
}

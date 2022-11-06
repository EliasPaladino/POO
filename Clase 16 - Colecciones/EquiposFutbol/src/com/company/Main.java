package com.company;

public class Main {


    public static void main(String[] args) {
        // write your code here

        Jugador jugador = new Jugador(2,"Icardi",true,true);

        Equipo equipo = new Equipo("PSG");

        equipo.addJugador(jugador);

        equipo.addJugador(new Jugador(30,"Messi",false,false));
        equipo.addJugador(new Jugador(1,"Pato",false,true));
        equipo.addJugador(new Jugador(11,"Di Maria",false,true));

    //    System.out.println(equipo.getCantidadJugadoresLesionados());

        equipo.mostrarJugadoresTitulares();
    }
}

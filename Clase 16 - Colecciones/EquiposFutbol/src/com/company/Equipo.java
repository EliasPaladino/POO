package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void addJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Integer getCantidadJugadoresLesionados(){

        Integer lesionados = 0;

        for (Jugador jugador : jugadores) {
            if (jugador.getTitular() && jugador.getLesionado()){
                lesionados++;
            }
        }


        return lesionados;
    }

    public void mostrarJugadoresTitulares(){

        jugadores.sort(null);

        for (Jugador jugador : jugadores) {
            if(jugador.getTitular()){
                System.out.println(jugador);
            }
        }
    }
}

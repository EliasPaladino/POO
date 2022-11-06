package com.company;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Propiedad> propiedades;


    public Municipio() {
        propiedades = new ArrayList<>();
    }

    public void addPropiedad(String propNueva) {
        try {
            propiedades.add(PropiedadFactory.getInstance().generarPropiedad(propNueva));
        } catch (PropiedadFactoryException e) {
            e.printStackTrace();
        }
    }

    public void mostrar() {
        System.out.println(propiedades);
    }
}

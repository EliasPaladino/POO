package com.company;

public class Test {

    public static void main(String[] args) throws PropiedadFactoryException{
        Municipio municipio = new Municipio();
        municipio.addPropiedad(PropiedadFactory.CASA_1);
        municipio.addPropiedad(PropiedadFactory.CASA_2);
        municipio.addPropiedad(PropiedadFactory.BARRIO);
        municipio.mostrar();
    }
}

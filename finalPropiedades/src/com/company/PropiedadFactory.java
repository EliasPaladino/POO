package com.company;

import java.util.ArrayList;
import java.util.List;

public class PropiedadFactory {
    private static PropiedadFactory instance;
    public static final String CASA_1 = "casa1";
    public static final String CASA_2 = "casa2";
    public static final String BARRIO = "barrio";
    private List<Propiedad> propiedades;

    private PropiedadFactory() {
        propiedades = new ArrayList<>();
    }

    public static PropiedadFactory getInstance() {
        if (instance == null) {
            instance = new PropiedadFactory();
        }
        return instance;
    }

    public Propiedad generarPropiedad(String cod) throws PropiedadFactoryException {
        switch (cod) {
            case CASA_1:
                return new Casa("Av. San Martín", 123, 500.0);
            case CASA_2:
                return new Casa("Mitre", 332, 700.0);
            case BARRIO:
                BarrioCerrado gutierres = new BarrioCerrado("Gutierres", 330, 2);
                gutierres.addPropiedad(generarPropiedad(PropiedadFactory.CASA_1));
                gutierres.addPropiedad(generarPropiedad(PropiedadFactory.CASA_2));
                return gutierres;
            default:
                throw new PropiedadFactoryException("El codigo no es valido");
        }
    }
}

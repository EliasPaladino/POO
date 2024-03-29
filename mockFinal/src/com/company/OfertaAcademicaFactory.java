package com.company;

public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instance;

    public static final String CODIGO_FULL_STACK = "full-stack";
    public static final String CODIGO_FRONT_END = "front-end";
    public static final String CODIGO_BACK_END = "back-end";


    private OfertaAcademicaFactory(){

    }

    public static OfertaAcademicaFactory getInstance() {
        if(instance == null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException{
        switch (codigo){
            case CODIGO_FRONT_END :
                return new Curso("front-end","soy un curso",16.0,2.0,1000.0);
            case CODIGO_BACK_END :
                return new Curso("back-end","soy un curso",20.0,2.0,900.0);
            case CODIGO_FULL_STACK :
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("full-stack", "soy un programa",0.2);
                programaIntensivo.agregarOferta(generarOfertaAcademica(CODIGO_FRONT_END));
                programaIntensivo.agregarOferta(generarOfertaAcademica(CODIGO_BACK_END));
                return programaIntensivo;
            default:
                throw new OfertaAcademicaFactoryException(codigo + " no es un codigo valido");
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Instituto instituto = new Instituto();
        instituto.agregarCurso(OfertaAcademicaFactory.CODIGO_FRONT_END);
        instituto.agregarCurso(OfertaAcademicaFactory.CODIGO_BACK_END);
        instituto.agregarCurso(OfertaAcademicaFactory.CODIGO_FULL_STACK);



        instituto.generarInforme();

    }
}

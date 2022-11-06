package com.company;

public class Yate extends Embarcacion implements Comparable{

    private Integer cantidadCamarotes;

    public Yate(Capitan capitan, Double valorBase, Double valorAdicional, Integer anioFabricacion, Double eslora, Integer cantidadCamarotes) {
        super(capitan, valorBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {
        Yate otroYate = (Yate) o;

    /*    if(this.cantidadCamarotes > otroYate.cantidadCamarotes) {
            return 1;
        }
        if(this.cantidadCamarotes < otroYate.cantidadCamarotes) {
            return -1;
        }

        return 0;*/

        //Esto solo puede ser utilizado con datos de tipo Integer!
       return (this.cantidadCamarotes - otroYate.cantidadCamarotes);
    }
}

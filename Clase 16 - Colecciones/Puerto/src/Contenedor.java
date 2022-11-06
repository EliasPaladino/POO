public class Contenedor implements Comparable<Contenedor> {
    private Integer numeroIdentificacion;
    private String paisOrigen;
    private boolean esPeligroso;

    public Contenedor(Integer numeroIdentificacion, String paisOrigen, boolean esPeligroso) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.paisOrigen = paisOrigen;
        this.esPeligroso = esPeligroso;
    }

    public Integer getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public boolean getEsPeligroso() {
        return esPeligroso;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    @Override
    public String toString() {
        return "\n\n" + "Numero de identificación: " + numeroIdentificacion + "\n" + "Pais de origen: "+ paisOrigen + "\n" + "Es peligroso: " + esPeligroso;
    }

    @Override
    public int compareTo(Contenedor o) {
        if(getNumeroIdentificacion() > o.getNumeroIdentificacion()) {
            return 1;
        }
        if(getNumeroIdentificacion() < o.getNumeroIdentificacion()) {
            return -1;
        }
        return 0;
    }
}

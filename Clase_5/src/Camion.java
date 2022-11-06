public class Camion {
    private String marca;
    private String patente;
    static private double precioNafta = 120.0;
    private double montoGastado;

    public Camion(String marca, String patente) {
        this.marca = marca;
        this.patente = patente;
    }

    public static double getPrecioNafta() {
        return precioNafta;
    }

    public static void setPrecioNafta(double precioNuevo) {
        precioNafta = precioNuevo;
    }

    public double calcularGastoCombustible(int litros) {
        return Camion.precioNafta * litros;
    }

    public void setMontoGastado(double montoGastado) {
        this.montoGastado = montoGastado;
    }

    public double getMontoGastado(){
        return montoGastado;
    }
}

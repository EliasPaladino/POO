public class Main {
    public static void main(String[] args) {
        Camion camion = new Camion("Ford", "AA 232 SD");

        camion.setMontoGastado(camion.calcularGastoCombustible(20));
        System.out.println(Camion.getPrecioNafta());
        System.out.println(camion.getMontoGastado());


        Camion.setPrecioNafta(140.0);
        System.out.println(Camion.getPrecioNafta());
        camion.setMontoGastado(camion.calcularGastoCombustible(20));
        System.out.println(camion.getMontoGastado());
    }
}

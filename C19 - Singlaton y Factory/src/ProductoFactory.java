public class ProductoFactory {
    private static ProductoFactory instance;
    public static final String CAJA = "CAJA10X10";
    public static final String PELOTA_FUTBOL = "PELOTAFUTBOL";
    public static final String PELOTA_TENIS = "PELOTATENIS";

    private ProductoFactory() {
    }

    public static ProductoFactory getInstance() {
        if(instance == null){
            instance = new ProductoFactory();
        }
        return instance;
    }

    public Producto generarProducto(String codigo){
        switch (codigo) {
            case CAJA:
                return new Caja(10, 10, 10);
            case PELOTA_FUTBOL:
                return new Pelota(11);
            case PELOTA_TENIS:
                return new Pelota(0.32);
            default: return null;
        }
    }
}

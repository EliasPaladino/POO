public class Main {
    public static void main(String[] args) {
        ProductoFactory producto = ProductoFactory.getInstance();

        Producto producto1 = producto.generarProducto("CAJA10X10");
        Producto producto2 = producto.generarProducto("PELOTATENIS");
        Producto producto3 = producto.generarProducto("PELOTAFUTBOL");

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println("La superficie de la caja es: " + producto1.calcularEspacio() + " cms");
        System.out.println("La superficie de la pelota de tenis es: " + producto2.calcularEspacio() + " cms");
        System.out.println("La superficie de la pelota de futbol es: " + producto3.calcularEspacio() + " cms");
    }
}

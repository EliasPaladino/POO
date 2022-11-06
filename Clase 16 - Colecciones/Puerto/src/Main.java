public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();
        Contenedor contenedor1 = new Contenedor(1,"Canadá", true);
        Contenedor contenedor2 = new Contenedor(2,"China", true);
        Contenedor contenedor3 = new Contenedor(3,"EEUU", false);
        Contenedor contenedor4 = new Contenedor(4,"Rusia", false);
        Contenedor contenedor5 = new Contenedor(5,"Desconocido", true);
        Contenedor contenedor6 = new Contenedor(6,"Desconocido", true);

        puerto.addContenedor(contenedor1);
        puerto.addContenedor(contenedor2);
        puerto.addContenedor(contenedor3);
        puerto.addContenedor(contenedor4);
        puerto.addContenedor(contenedor5);
        puerto.addContenedor(contenedor6);

        puerto.mostrarContenedores();

        System.out.println("\n\n" + "La cantidad de contenedores peligrosos de origen Desconocido es: " + puerto.calcularCantidadPeligrosos());
    }
}

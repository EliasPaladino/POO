import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Contenedor> contenedores = new ArrayList();

    public void addContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        contenedores.sort(null);
        System.out.println(contenedores);
    }

    public Integer calcularCantidadPeligrosos() {
        Integer cantidad = 0;

        for (Contenedor contenedor : contenedores) {
            if(contenedor.getEsPeligroso()) {
                if(contenedor.getPaisOrigen().equals("Desconocido")){
                    cantidad++;
                }
            }
        }
        return cantidad;
    }
}

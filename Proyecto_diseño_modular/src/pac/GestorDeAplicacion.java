package pac;

public class GestorDeAplicacion {
    public void buscarPorNombre(Producto[] productos, String nombre) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].obtenerNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("Producto encontrado: " + productos[i].obtenerNombre());
            }
        }
    }
}

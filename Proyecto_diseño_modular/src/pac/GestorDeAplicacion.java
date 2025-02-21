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
	public void buscarPorOrigen(Producto[] productos, String origen) {
    for (int i = 0; i < productos.length; i++) {
        if (productos[i].obtenerOrigen().toLowerCase().equals(origen.toLowerCase())) {
            System.out.println("Producto encontrado: " + productos[i].obtenerNombre());
        }
    }
}
	public void ordenarPorPrecio(Producto[] productos) {
    Producto productoTemporal;
    for (int i = 0; i < productos.length - 1; i++) {
        for (int j = i + 1; j < productos.length; j++) {
            if (productos[i].obtenerPrecio() > productos[j].obtenerPrecio()) {
                // Intercambiar los productos directamente sin usar 'temp'
                productoTemporal = productos[i];
                productos[i] = productos[j];
                productos[j] = productoTemporal;
            }
        }
    }
    System.out.println("Productos ordenados por precio de menor a mayor:");
    mostrarProductos(productos);
}
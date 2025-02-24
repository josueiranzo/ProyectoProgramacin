package pac;

public class GestorDeAplicacion {
    
    public void buscarPorNombre(Producto[] productos, String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].obtenerNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("Producto encontrado: " + productos[i].obtenerNombre() + 
                                   " - Origen: " + productos[i].obtenerOrigen() + 
                                   " - Precio: $" + productos[i].obtenerPrecio());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos con ese nombre.");
        }
    }

    public void buscarPorOrigen(Producto[] productos, String origen) {
        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].obtenerOrigen().toLowerCase().equals(origen.toLowerCase())) {
                System.out.println("Producto encontrado: " + productos[i].obtenerNombre() + 
                                   " - Origen: " + productos[i].obtenerOrigen() + 
                                   " - Precio: $" + productos[i].obtenerPrecio());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos de ese origen.");
        }
    }

    public void ordenarPorPrecio(Producto[] productos) {
        Producto productoTemporal;
        for (int i = 0; i < productos.length - 1; i++) {
            for (int j = i + 1; j < productos.length; j++) {
                if (productos[i].obtenerPrecio() > productos[j].obtenerPrecio()) {
                    productoTemporal = productos[i];
                    productos[i] = productos[j];
                    productos[j] = productoTemporal;
                }
            }
        }
        System.out.println("Productos ordenados por precio de menor a mayor:");
        mostrarProductos(productos);
    }

    public void ordenarPorPrecioDescendente(Producto[] productos) {
        Producto productoTemporal;
        for (int i = 0; i < productos.length - 1; i++) {
            for (int j = i + 1; j < productos.length; j++) {
                if (productos[i].obtenerPrecio() < productos[j].obtenerPrecio()) {
                    productoTemporal = productos[i];
                    productos[i] = productos[j];
                    productos[j] = productoTemporal;
                }
            }
        }
        System.out.println("Productos ordenados por precio de mayor a menor:");
        mostrarProductos(productos);
    }

    public void mostrarProductos(Producto[] productos) {
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i].obtenerNombre() + 
                               " - Origen: " + productos[i].obtenerOrigen() + 
                               " - Precio: $" + productos[i].obtenerPrecio());
        }
    }
}

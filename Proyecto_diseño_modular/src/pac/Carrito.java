package pac;

public class Carrito {
    Producto[] productos = new Producto[10];  
    double[] cantidades = new double[10];  
    int contadorCarrito = 0; 

    public void agregarProducto(Producto producto, double cantidad) {
        if (contadorCarrito < productos.length) {
            productos[contadorCarrito] = producto;
            cantidades[contadorCarrito] = cantidad;
            contadorCarrito++;
            System.out.println("Producto añadido al carrito: " + producto.obtenerNombre() + " - Cantidad: " + cantidad);
        } else {
            System.out.println("El carrito está lleno.");
        }
    }
    public void eliminarProducto(int indice) {
        if (indice >= 0 && indice < contadorCarrito) {
            System.out.println("Producto eliminado del carrito: " + productos[indice].obtenerNombre());
            
            for (int i = indice; i < contadorCarrito - 1; i++) {
                productos[i] = productos[i + 1];
                cantidades[i] = cantidades[i + 1];
            }
            contadorCarrito--;  
        } else {
            System.out.println("Índice no válido.");
        }
    }

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

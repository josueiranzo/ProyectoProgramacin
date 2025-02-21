package pac;

public class Producto {
    String nombre;
    String origen;
    double precio;

    public Producto(String nombre, String origen, double precio) {
        this.nombre = nombre;
        this.origen = origen;
        this.precio = precio;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerOrigen() {
        return origen;
    }

    public double obtenerPrecio() {
        return precio;
    }
}

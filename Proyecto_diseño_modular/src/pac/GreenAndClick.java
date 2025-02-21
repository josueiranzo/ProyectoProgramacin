package pac;

public class GreenAndClick {
    public static void main(String[] args) {
        Producto[] productosDisponibles = new Producto[]{
            new Producto("Maria Juana", "Mexico", 1.70),
            new Producto("Hierba de los bosques", "Andorra", 4.20),
            new Producto("La seta feliz", "Marrueco", 2.47),
            new Producto("El oro verde", "Palestina", 1.33)
        };

        Carrito carrito = new Carrito();
        GestorDeAplicacion gestor = new GestorDeAplicacion();
    }
}


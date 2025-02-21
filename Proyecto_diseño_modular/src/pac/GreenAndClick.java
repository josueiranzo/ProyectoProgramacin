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
			System.out.println("Buenos días! ¿Qué quieres hacer hoy?");
		
			System.out.println("Usuario selecciona buscar por nombre");
			String nombreBusqueda = "Juana"; 
			gestor.buscarPorNombre(productosDisponibles, nombreBusqueda);
			
			System.out.println("Usuario selecciona buscar por origen");
			String origenBusqueda = "Andorra"; 
			gestor.buscarPorOrigen(productosDisponibles, origenBusqueda);
			
			System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
			gestor.ordenarPorPrecio(productosDisponibles);
			
			System.out.println("Usuario selecciona ordenar por precio de mayor a menor");
			gestor.ordenarPorPrecioDescendente(productosDisponibles);
			System.out.println("Usuario selecciona varios productos para comprar");
			carrito.agregarProducto(productosDisponibles[1], 3);  carrito.agregarProducto(productosDisponibles[3], 1);  carrito.agregarProducto(productosDisponibles[2], 2.5);  
			
			System.out.println("Usuario elimina el segundo producto de su carrito");
			carrito.eliminarProducto(1);
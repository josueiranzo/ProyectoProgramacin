package pac;

import java.util.Scanner;

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
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido a GreenAndClick!");
        boolean seguir = true;
        
        while (seguir) {
            System.out.println("\n¿Qué te gustaría hacer?");
            System.out.println("1. Buscar por nombre");
            System.out.println("2. Buscar por origen");
            System.out.println("3. Ordenar productos por precio (de menor a mayor)");
            System.out.println("4. Ordenar productos por precio (de mayor a menor)");
            System.out.println("5. Ver productos disponibles");
            System.out.println("6. Agregar productos al carrito");
            System.out.println("7. Eliminar producto del carrito");
            System.out.println("8. Finalizar compra");
            System.out.println("9. Salir");
            System.out.print("Por favor, elige una opción (1-9): ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine();  
            if (opcion == 1) {
                System.out.print("Introduce el nombre del producto que deseas buscar: ");
                String nombreBusqueda = scanner.nextLine();
                gestor.buscarPorNombre(productosDisponibles, nombreBusqueda);
            } 
            else if (opcion == 2) {
                System.out.print("Introduce el origen del producto que deseas buscar: ");
                String origenBusqueda = scanner.nextLine();
                gestor.buscarPorOrigen(productosDisponibles, origenBusqueda);
            } 
            else if (opcion == 3) {
                gestor.ordenarPorPrecio(productosDisponibles);
            } 
            else if (opcion == 4) {
                gestor.ordenarPorPrecioDescendente(productosDisponibles);
            } 
            else if (opcion == 5) {
                System.out.println("Productos disponibles:");
                gestor.mostrarProductos(productosDisponibles);
            } 
            else if (opcion == 6) {
                System.out.print("Introduce el nombre del producto que deseas agregar al carrito: ");
                String nombreProducto = scanner.nextLine();
                Producto productoSeleccionado = null;
                for (Producto producto : productosDisponibles) {
                    if (producto.obtenerNombre().equalsIgnoreCase(nombreProducto)) {
                        productoSeleccionado = producto;
                        break;
                    }
                }
                
                if (productoSeleccionado != null) {
                    System.out.print("¿Cuántas unidades deseas agregar?: ");
                    double cantidad = scanner.nextDouble();
                    carrito.agregarProducto(productoSeleccionado, cantidad);
                } else {
                    System.out.println("Producto no encontrado.");
                }
            } 
            else if (opcion == 7) {
                System.out.println("Productos en el carrito:");
                carrito.mostrarCarrito();
                System.out.print("Introduce el número del producto que deseas eliminar (índice en la lista): ");
                int indiceEliminar = scanner.nextInt();
                carrito.eliminarProducto(indiceEliminar);
            } 
            else if (opcion == 8) {
                double total = carrito.calcularTotal();
                System.out.println("El total de tu compra es: $" + total);
                System.out.println("Gracias por comprar con nosotros!");
                seguir = false;  
            } 
            else if (opcion == 9) {
                System.out.println("¡Hasta pronto!");
                seguir = false;  
            } 
            else {
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 9.");
            }
        }

        scanner.close(); 
    }
}

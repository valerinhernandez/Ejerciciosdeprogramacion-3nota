import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    // Constantes para el menú
    private static final String OPCION_SALIR = "0";
    private static final String OPCION_AGREGAR = "1";
    private static final String OPCION_ELIMINAR = "2";
    private static final String OPCION_MODIFICAR = "3";
    private static final String OPCION_VER_INVENTARIO = "4";
    
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario  
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar datos de productos
        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        // Bucle de menú para interactuar con el inventario
        String opcion;
        do {
            // Menú de opciones
            System.out.println("\nMenú de Inventario:");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Ver inventario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.next();

            switch (opcion) {
                case OPCION_AGREGAR:
                    agregarProducto(scanner, productos, cantidades, precios);
                    break;
                case OPCION_ELIMINAR:
                    eliminarProducto(scanner, productos, cantidades, precios);
                    break;
                case OPCION_MODIFICAR:
                    modificarProducto(scanner, productos, cantidades, precios);
                    break;
                case OPCION_VER_INVENTARIO:
                    mostrarInventario(productos, cantidades, precios);
                    break;
                case OPCION_SALIR:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (!opcion.equals(OPCION_SALIR));
    }

    // Función para agregar un nuevo producto
    private static void agregarProducto(Scanner scanner, ArrayList<String> productos, ArrayList<Integer> cantidades, ArrayList<Double> precios) {
        System.out.println("Ingrese el nombre del nuevo producto:");
        String nombreProducto = scanner.next();
        System.out.println("Ingrese la cantidad del producto:");
        int cantidadProducto = scanner.nextInt();
        System.out.println("Ingrese el precio del producto:");
        double precioProducto = scanner.nextDouble();

        productos.add(nombreProducto);
        cantidades.add(cantidadProducto);
        precios.add(precioProducto);

        System.out.println("Producto agregado exitosamente.");
    }

    // Función para eliminar un producto
    private static void eliminarProducto(Scanner scanner, ArrayList<String> productos, ArrayList<Integer> cantidades, ArrayList<Double> precios) {
        System.out.println("Ingrese el número del producto a eliminar:");
        mostrarProductos(productos);
        int index = scanner.nextInt() - 1;  // Se resta 1 para usarlo como índice

        if (index >= 0 && index < productos.size()) {
            productos.remove(index);
            cantidades.remove(index);
            precios.remove(index);
            System.out.println("Producto eliminado exitosamente.");
        } else {
            System.out.println("Número de producto inválido.");
        }
    }

    // Función para modificar un producto
    private static void modificarProducto(Scanner scanner, ArrayList<String> productos, ArrayList<Integer> cantidades, ArrayList<Double> precios) {
        System.out.println("Ingrese el número del producto a modificar:");
        mostrarProductos(productos);
        int index = scanner.nextInt() - 1;  // Se resta 1 para usarlo como índice

        if (index >= 0 && index < productos.size()) {
            System.out.println("Ingrese el nuevo nombre del producto (actual: " + productos.get(index) + "):");
            String nuevoNombre = scanner.next();
            System.out.println("Ingrese la nueva cantidad del producto (actual: " + cantidades.get(index) + "):");
            int nuevaCantidad = scanner.nextInt();
            System.out.println("Ingrese el nuevo precio del producto (actual: " + precios.get(index) + "):");
            double nuevoPrecio = scanner.nextDouble();

            productos.set(index, nuevoNombre);
            cantidades.set(index, nuevaCantidad);
            precios.set(index, nuevoPrecio);

            System.out.println("Producto modificado exitosamente.");
        } else {
            System.out.println("Número de producto inválido.");
        }
    }

    // Función para mostrar el inventario completo en formato de tabla
    private static void mostrarInventario(ArrayList<String> productos, ArrayList<Integer> cantidades, ArrayList<Double> precios) {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        double valorTotalInventario = 0;

        // Encabezados de la tabla
        System.out.println("\nDetalles del inventario:");
        System.out.printf("%-20s %-10s %-15s %-15s\n", "Producto", "Cantidad", "Precio Unitario", "Precio Total");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < productos.size(); i++) {
            double valorTotalProducto = cantidades.get(i) * precios.get(i);
            System.out.printf("%-20s %-10d %-15.2f %-15.2f\n", productos.get(i), cantidades.get(i), precios.get(i), valorTotalProducto);
            valorTotalInventario += valorTotalProducto;
        }

        // Muestra el valor total del inventario
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-15s %-15.2f\n", "Total Inventario", "", "", valorTotalInventario);
    }

    // Función auxiliar para mostrar la lista de productos con índices
    private static void mostrarProductos(ArrayList<String> productos) {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }
}


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionLibros {

    // Ruta del archivo donde se almacenarán los libros
    private static final String ARCHIVO_LIBROS = "libros.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar menú
            System.out.println("\nGestión de Libros");
            System.out.println("1. Añadir libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Listar libros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    añadirLibro(scanner);
                    break;
                case 2:
                    buscarLibro(scanner);
                    break;
                case 3:
                    listarLibros();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    // Función para añadir un libro
    private static void añadirLibro(Scanner scanner) {
        System.out.print("Ingrese el título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese el año de publicación: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String libro = titulo + "," + autor + "," + anio;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_LIBROS, true))) {
            writer.write(libro);
            writer.newLine();
            System.out.println("Libro añadido exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el libro: " + e.getMessage());
        }
    }

    // Función para buscar un libro por título
    private static void buscarLibro(Scanner scanner) {
        System.out.print("Ingrese el título del libro a buscar: ");
        String tituloBuscado = scanner.nextLine();
        boolean encontrado = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equalsIgnoreCase(tituloBuscado)) {
                    System.out.println("Libro encontrado:");
                    System.out.println("Título: " + datos[0]);
                    System.out.println("Autor: " + datos[1]);
                    System.out.println("Año: " + datos[2]);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró el libro con título \"" + tituloBuscado + "\".");
            }
        } catch (IOException e) {
            System.err.println("Error al buscar el libro: " + e.getMessage());
        }
    }

    // Función para listar todos los libros
    private static void listarLibros() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            System.out.println("\nLista de libros:");
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println("Título: " + datos[0]);
                System.out.println("Autor: " + datos[1]);
                System.out.println("Año: " + datos[2]);
                System.out.println("-----------------------");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo de libros. Añada un libro primero.");
        } catch (IOException e) {
            System.err.println("Error al listar los libros: " + e.getMessage());
        }
    }
}

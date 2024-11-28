import java.io.*;
import java.util.Scanner;

public class NotasApp {

    private static final String ARCHIVO_NOTAS = "notas.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    agregarNota(scanner);
                    break;
                case 2:
                    verNotas();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Agregar nota");
        System.out.println("2. Ver notas");
        System.out.println("3. Salir");
    }

    private static void agregarNota(Scanner scanner) {
        System.out.print("Escribe tu nota: ");
        String nota = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_NOTAS, true))) {
            writer.write(nota);
            writer.newLine();
            System.out.println("Nota guardada con éxito.");
        } catch (IOException e) {
            System.out.println("Error al guardar la nota: " + e.getMessage());
        }
    }

    private static void verNotas() {
        File archivo = new File(ARCHIVO_NOTAS);

        if (!archivo.exists()) {
            System.out.println("No hay notas guardadas.");
            return;
        }

        System.out.println("\nNotas guardadas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_NOTAS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("- " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las notas: " + e.getMessage());
        }
    }
}

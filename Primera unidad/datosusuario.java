import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

       
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

      
        System.out.print("Ingrese su altura en metros (por ejemplo, 1.75): ");
        double altura = scanner.nextDouble();

       
        System.out.println("\n¡Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años y mides " + altura + " metros.");

      
        scanner.close();
    }
}
  
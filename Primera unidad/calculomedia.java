import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcular la media de los tres números
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado
        System.out.println("\nLa media de los números ingresados es: " + media);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
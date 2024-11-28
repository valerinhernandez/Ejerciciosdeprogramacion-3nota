import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Elige una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Selecciona una opción (1-4): ");
        
        
        int opcion = scanner.nextInt();

        
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        
        double resultado;

       
        switch (opcion) {
            case 1:  // Sumar
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:  // Restar
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:  // Multiplicar
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:  // Dividir 
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error: no se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 4.");
        }

      
        scanner.close();
    }
}

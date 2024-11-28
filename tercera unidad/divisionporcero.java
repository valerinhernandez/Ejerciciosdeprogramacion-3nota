import java.util.Scanner;

public class DivisionPorCero {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

       
        try {
            int resultado = dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
           
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
           
            scanner.close();
        }
    }

   
    public static int dividir(int a, int b) {
        return a / b;  
    }
}



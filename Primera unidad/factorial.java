import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingresa un número entero no negativo: ");
        int number = scanner.nextInt();

       
        if (number < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1; 
            int i = number;  

           
            while (i > 0) {
                factorial *= i;
                i--;
            }

           
            System.out.println("El factorial de " + number + " es: " + factorial);
        }

        scanner.close(); 
    }
}


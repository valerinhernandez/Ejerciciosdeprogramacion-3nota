import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; 
        int sum = 0;               

        System.out.println("Ingresa 5 números:");

        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; 
        }

        
        double average = (double) sum / numbers.length;

       
        System.out.println("El promedio de los números ingresados es: " + average);

        scanner.close();
    }
}

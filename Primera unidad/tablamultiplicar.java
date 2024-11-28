import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa un número entero para generar su tabla de multiplicar: ");
        int number = scanner.nextInt();

        System.out.println("Tabla de multiplicar del número " + number + ":");

        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close(); 
    }
}



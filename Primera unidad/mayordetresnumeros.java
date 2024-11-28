import java.util.Scanner;

public class MayorDeTresNumeros {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los tres números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();

       
        double mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

       
        System.out.println("El número mayor es: " + mayor);

     
        scanner.close();
    }
}
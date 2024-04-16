import java.util.Scanner;

public class Ejercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("/// Ingrese tres números ///");
        System.out.println("");

        System.out.println("Número 1: ");
        System.out.print("||");
        double num1 = scanner.nextDouble();

        System.out.println("");
        System.out.println("Número 2: ");
        System.out.print("||");
        double num2 = scanner.nextDouble();

        System.out.println("");
        System.out.println("Número 3: ");
        System.out.print("||");
        double num3 = scanner.nextDouble();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("");
                System.out.println("El orden de Mayor a Menor es: " + num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println("");
                System.out.println("El orden de Mayor a Menor es: " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("");
                System.out.println("El orden de Mayor a Menor es: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("");
                System.out.println("El orden de Mayor a Menor es: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 >= num2) {
                System.out.println("");
                System.out.println("El orden de Mayor a Menor es: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("");
                System.out.println("El orden de Mayor a Menor es: " + num3 + ", " + num2 + ", " + num1);
            }
        }

        scanner.close();
    }
}

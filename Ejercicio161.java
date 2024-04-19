import java.util.Scanner;

public class Ejercicio161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Ingrese 2 variables ////");
        System.out.println("");

        System.out.println("- Primera variable:");
        System.out.print("||");
        int variable1 = scanner.nextInt();

        System.out.println("");
        System.out.println("- Segunda variable:");
        System.out.print("||");
        int variable2 = scanner.nextInt();

        System.out.println("");
        System.out.println("Valores originales:");
        System.out.println("- Variable 1: " + variable1);
        System.out.println("- Variable 2: " + variable2);

        int temp = variable1;
        variable1 = variable2;
        variable2 = temp;

        System.out.println("");
        System.out.println("Valores intercambiados:");
        System.out.println("- Variable 1: " + variable1);
        System.out.println("- Variable 2: " + variable2);

        scanner.close();
    }
}

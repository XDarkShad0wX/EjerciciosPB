import java.util.Scanner;

public class Ejercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        System.out.print("||");
        int edad = scanner.nextInt();

        System.out.println("Ha ingresado la edad: " + edad);
        System.out.print("||");

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        do {
            System.out.println("Ingrese una edad (entre 1 y 100): ");
            System.out.print("||");
            edad = scanner.nextInt();
        } while (edad < 1 || edad > 100);

        if (edad >= 18) {
            System.out.println("");
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("");
            System.out.println("Es menor de edad.");
        }

        scanner.close();
    }
}

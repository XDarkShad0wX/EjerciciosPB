import java.util.Scanner;

public class Ejercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("Ingrese un número entero");
        int numeroEntero = scanner.nextInt();

        System.out.println("");
        System.out.print("Ingrese un número real");
        double numeroReal = scanner.nextDouble();

        System.out.println("");
        System.out.println("El número entero es: " + numeroEntero);
        System.out.println("El número real es: " + numeroReal);

        scanner.close();
    }
}

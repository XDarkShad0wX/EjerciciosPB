import java.util.Scanner;

public class Ejercicio108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        System.out.print("");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("");
            System.out.println("El numero " + numero + " es par.");
        } else {
            System.out.println("");
            System.out.println("El numero " + numero + " es impar.");
        }

        scanner.close();
    }
}

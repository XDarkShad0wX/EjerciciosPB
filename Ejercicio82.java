import java.util.Scanner;

public class Ejercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        System.out.print("||");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("");
            System.out.println("El numero " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("");
            System.out.println("El numero " + numero + " es negativo.");
        } else {
            System.out.println("");
            System.out.println("El numero " + numero + " es cero.");
        }

        scanner.close();
    }
}

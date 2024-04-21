import java.util.Scanner;

public class Ejercicio207 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Ingrese 2 numeros reales ////");
        System.out.println("");

        System.out.println("- Primer valor real:");
        System.out.print("||");
        double valor1 = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingrese el segundo valor real:");
        System.out.print("||");
        double valor2 = scanner.nextDouble();

        double suma = valor1 + valor2;
        double resta = valor1 - valor2;
        double division = valor1 / valor2;
        double multiplicacion = valor1 * valor2;

        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("División: " + division);
        System.out.println("Multiplicación: " + multiplicacion);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de la base: ");
        System.out.print("||");
        double base = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingrese el exponente: ");
        System.out.println("||");
        int exponente = scanner.nextInt();

        boolean esNegativo = exponente < 0;
        exponente = Math.abs(exponente);

        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        if (esNegativo) {
            resultado = 1 / resultado;
        }

        System.out.println("");
        System.out.println("El numero " + base + " elevado a la potencia " + exponente + " es igual a: " + resultado);

        scanner.close();
    }
}

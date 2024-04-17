import java.util.Scanner;

public class Ejercicio118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double montoTotal = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            System.out.println("Ingrese el monto para el articulo " + i + ": ");
            System.out.print("||");
            double montoArticulo = scanner.nextDouble();

            montoTotal += montoArticulo;
        }

        System.out.println("");
        System.out.println("El monto total a pagar es: $" + montoTotal);

        scanner.close();
    }
}

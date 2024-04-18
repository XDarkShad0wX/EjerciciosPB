import java.util.Scanner;

public class Ejercicio130 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto total a pagar: ");
        System.out.print("||");
        double monto = scanner.nextDouble();

        System.out.println("Ingrese el plazo de pago en meses (12 o 24): ");
        System.out.print("||");
        int limite = scanner.nextInt();

        double interes = 0.02;
        double montoPorMes = monto / limite;
        double totalPagado = 0;

        for (int i = 1; i <= limite; i++) {
            double interesMensual = totalPagado * interes;
            totalPagado += montoPorMes + interesMensual;

            System.out.println("");
            System.out.printf("Mes %d: Total a pagar = %.2f\n", i, totalPagado);
        }

        System.out.println("");
        System.out.printf("- Total a pagar es: %.2f\n", totalPagado);

        scanner.close();
    }
}

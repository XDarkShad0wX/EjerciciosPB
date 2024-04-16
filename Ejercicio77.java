import java.util.Scanner;

public class Ejercicio77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el capital del préstamo: ");
        System.out.print("||");
        double capital = scanner.nextDouble();

        System.out.println("Ingrese el interés anual (en porcentaje): ");
        System.out.print("||");
        double interesAnual = scanner.nextDouble();

        System.out.print("Ingrese el número de años: ");
        int numAnios = scanner.nextInt();

        double interesMensual = interesAnual / (12 * 100);
        int numPagos = numAnios * 12;
        double cuotaMensual = (interesMensual * capital) / (1 - Math.pow(1 + interesMensual, -numPagos));
        double totalPagar = cuotaMensual * numPagos;

        System.out.println("El pago mensual de la hipoteca es: $" + cuotaMensual);
        System.out.println("El total a pagar es: $" + totalPagar);

        scanner.close();
    }
}

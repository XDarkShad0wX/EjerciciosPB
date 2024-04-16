import java.util.Scanner;

public class Ejercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas");
        System.out.print("||");
        int horasT = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora");
        System.out.print("||");
        double tarifaPorH = scanner.nextDouble();

        double salario;

        if (horasT > 40) {
            int horasExtras = horasT - 40;
            double tarifaNormal = 40 * tarifaPorH;
            double tarifaExtra = horasExtras * (tarifaPorH * 1.5);
            salario = tarifaNormal + tarifaExtra;
        } else {
            salario = horasT * tarifaPorH;
        }

        System.out.println("El salario del trabajador es: $" + salario);

        scanner.close();
    }
}

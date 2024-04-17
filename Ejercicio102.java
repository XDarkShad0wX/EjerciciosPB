import java.util.Scanner;

public class Ejercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        System.out.print("||");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        double salario = horasTrabajadas * tarifaPorHora;

        if (horasTrabajadas > 40) {

            int horasExtras = horasTrabajadas - 40;

            double tarifaHorasExtras = tarifaPorHora * 1.25;

            double salarioHorasExtras = horasExtras * tarifaHorasExtras;

            salario += salarioHorasExtras;
        }

        System.out.println("");
        System.out.println("El salario total sera de: " + salario);

        scanner.close();
    }
}

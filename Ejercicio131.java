import java.util.Scanner;

public class Ejercicio131 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una tarifa por hora de trabajo: ");
        System.out.print("||");
        float tarifaHora = scanner.nextFloat();

        System.out.println("");
        System.out.println("Ingrese las horas trabajadas: ");
        System.out.print("||");
        int horasTrabajadas = scanner.nextInt();

        float total;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            total = (40 * tarifaHora) + (horasExtras * tarifaHora * 2);
        } else {
            total = horasTrabajadas * tarifaHora;
        }

        System.out.println("");
        System.out.println("El salario total sera de: " + total);

        scanner.close();
    }
}

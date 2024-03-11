import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        System.out.print("||");
        int horasT = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora: ");
        System.out.print("||");
        float tarifa = scanner.nextFloat();

        float sueldo = horasT * tarifa;
        float tarifaExtra = 0.50f * tarifa;
        float sueldoTotal;

        if (horasT > 40) {
            float horasExtra = horasT - 40;
            float pagoExtra = horasExtra * tarifaExtra;
            sueldoTotal = sueldo + pagoExtra;
        } else {
            sueldoTotal = sueldo;
        }

        System.out.println("El total del sueldo es de: " + sueldoTotal);

        scanner.close();
    }
}

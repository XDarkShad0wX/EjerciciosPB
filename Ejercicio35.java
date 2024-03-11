import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        int horasT = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora: ");
        float tarifa = scanner.nextFloat();

        float sueldoBase = horasT * tarifa;
        float tarifaExtra = 0.50f * tarifa;
        float sueldoTotal;

        if (horasT > 40) {
            float horasExtra = horasT - 40;
            float pagoExtra = horasExtra * tarifaExtra;
            sueldoTotal = sueldoBase + pagoExtra;
        } else {
            sueldoTotal = sueldoBase;
        }

        System.out.println("El total del sueldo es de: " + sueldoTotal);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio178 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese la duración en minutos de la llamada: ");
        System.out.print("||");
        int duracionLlamada = scanner.nextInt();

        double costoTotal = 0;

        if (duracionLlamada <= 3) {
            costoTotal = 3.00;
        } else if (duracionLlamada <= 7) {
            costoTotal = 3.00 + (duracionLlamada - 3) * 1.5;
        } else {
            costoTotal = 3.00 + 4 * 1.5 + (duracionLlamada - 7) * 3.00;
        }

        System.out.println("");
        System.out.println("El costo de la llamada es: $" + costoTotal);

        scanner.close();
    }
}

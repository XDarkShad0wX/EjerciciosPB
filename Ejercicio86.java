import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese cinco voltajes ///");

        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            System.out.println("Voltaje " + i + ": ");
            System.out.print("||");
            double voltaje = scanner.nextDouble();

            suma += voltaje;
        }

        double promedio = suma / 5;

        if (promedio > 220) {
            System.out.println("");
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("");
            System.out.println("VOLTAJE CORRECTO");
        }

        scanner.close();
    }
}

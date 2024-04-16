import java.util.Scanner;

public class Ejercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese tres voltajes ///");

        double suma = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("");
            System.out.println("Voltaje " + i + ": ");
            System.out.print("||");
            double voltaje = scanner.nextDouble();
            suma += voltaje;
        }

        float promedio = (float) (suma / 3);

        if (promedio < 115) {
            System.out.println("");
            System.out.println("VOLTAJE CORRECTO");
        } else if (promedio >= 115 && promedio < 220) {
            System.out.println("");
            System.out.println("ALTO VOLTAJE");
        } else {
            System.out.println("");
            System.out.println("PELIGRO");
        }

        scanner.close();
    }
}

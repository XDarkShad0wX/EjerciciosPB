import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double descuento;


        try {
            System.out.println("Digite el sueldo del trabajador");
            System.out.println("||");
            double sueldo = scanner.nextDouble();

            if (sueldo <= 1000) {
                descuento = sueldo * 0.10;
            } else if (sueldo <= 2000) {
                double adicional = sueldo - 1000;
                descuento = (1000 * 0.10) + (adicional * 0.05);
            } else {
                double adicional = sueldo - 2000;
                descuento = (1000 * 0.10) + (1000 * 0.05) + (adicional * 0.03);
            }

            double sueldoNeto = sueldo - descuento;

            System.out.println(String.format("El descuento es: $%.2f", descuento));
            System.out.println(String.format("El sueldo neto es: $%.2f", sueldoNeto));

        } catch (InputMismatchException e) {
            System.out.println("//// Ingrese un número válido ////");
        } finally {
            scanner.close();
        }
    }
}

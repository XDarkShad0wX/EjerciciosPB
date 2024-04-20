import java.util.Scanner;

public class Ejercicio190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("/// Transaccion " + i + " ///");
            System.out.println("");
            System.out.println("- Ingrese el monto a pagar:");
            System.out.print("||");
            double montoTotal = scanner.nextDouble();

            System.out.println("");
            System.out.println("- Ingrese el monto recibido:");
            System.out.print("||");
            double montoRecibido = scanner.nextDouble();

            double cambio = montoRecibido - montoTotal;

            if (cambio < 0) {
                System.out.println("");
                System.out.println("//// El monto es insuficiente ////");
                continue;
            }

            System.out.println("");
            System.out.println("Cambio a devolver: $" + cambio);

            int[] denominaciones = {1000, 500, 300, 200, 100, 50, 10, 5, 1};
            String[] nombresDenominaciones = {"$1000", "$500", "$300", "$200", "$100", "$50", "$10", "$5", "$1"};

            System.out.println("");
            System.out.println("- Denominaciones:");

            for (int j = 0; j < denominaciones.length; j++) {
                int cantidad = (int) (cambio / denominaciones[j]);
                cambio %= denominaciones[j];
                if (cantidad > 0) {
                    System.out.println("");
                    System.out.println(cantidad + " x " + nombresDenominaciones[j]);
                }
            }
        }

        scanner.close();
    }
}

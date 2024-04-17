import java.util.Scanner;

public class Ejercicio113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione un tipo de transporte:");
        System.out.println("1) Motocicleta");
        System.out.println("2) Automóvil");
        System.out.println("3) Pickup");
        System.out.println("----------------------------------");
        System.out.println("");

        System.out.print("||");
        int opcion = scanner.nextInt();

        int distanciaMonterrey = 500;
        float motocicleta = 20;
        float automovil = 10;
        float pickup = 5;

        float costoGasolina = 0;
        switch (opcion) {
            case 1:
                costoGasolina = distanciaMonterrey / motocicleta;
                break;
            case 2:
                costoGasolina = distanciaMonterrey / automovil;
                break;
            case 3:
                costoGasolina = distanciaMonterrey / pickup;
                break;
            default:
            System.out.println("");
            System.out.println("/// La opcion no es valida ///");
                break;
        }

        System.out.println("");
        System.out.println("El costo gasolina para viajar a Monterrey es: $" + costoGasolina);

        scanner.close();
    }
}

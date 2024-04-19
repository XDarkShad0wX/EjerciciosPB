import java.util.Scanner;

public class Ejercicio132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000;
        int opcion;

        do {
            System.out.println("");
            System.out.println("/////// Menu: ///////");
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Salir");
            System.out.println("---------------------");
            System.out.print("||");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("Ingrese la cantidad a depositar: ");
                    System.out.print("||");
                    double cantidadDeposito = scanner.nextDouble();

                    saldo += cantidadDeposito;

                    System.out.println("");
                    System.out.println("- El deposito se realizo correctamente -");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Ingrese la cantidad a retirar: ");
                    System.out.print("||");
                    double cantidadRetiro = scanner.nextDouble();

                    if (cantidadRetiro <= saldo) {

                        saldo -= cantidadRetiro;

                        System.out.println("");
                        System.out.println("- El Retiro se realizo correctamente -");
                    } else {
                        System.out.println("");
                        System.out.println("//// Saldo insuficiente ////");
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("/_/-/_/-/ Ha salido del programa /_/-/_/-/");
                    break;
                default:
                    System.out.println("");
                    System.out.println("//// No es una opción no valida ////");
                    break;
            }

        } while (opcion != 3);

        System.out.println("");
        System.out.println("- Su saldo final es de: " + saldo);

        scanner.close();
    }
}

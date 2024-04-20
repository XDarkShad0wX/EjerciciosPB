import java.util.Scanner;

public class Ejercicio171 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Sistema de conversion ////");
        System.out.println("- Opcion: ");
        System.out.println("1 - Libras a Kilogramos");
        System.out.println("2 - Millas a Kilometros");
        System.out.println("3 - Galones a Litros");
        System.out.println("4 - Fahrenheit a Celsius");
        System.out.println("5 - Salir");
        System.out.println("-------------------------------");
        System.out.print("||");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("");
                System.out.println("Ingrese la cantidad en Libras: ");
                System.out.print("||");
                double libras = scanner.nextDouble();

                double kilogramos = libras * 0.453592;

                System.out.println("");
                System.out.println(libras + " Libras equivalen a " + kilogramos + " Kilogramos.");
                break;
            case 2:
                System.out.println("");
                System.out.println("Ingrese la cantidad en Millas: ");
                System.out.print("||");
                double millas = scanner.nextDouble();

                double kilometros = millas * 1.60934;

                System.out.println("");
                System.out.println(millas + " Millas equivalen a " + kilometros + " Kilómetros.");
                break;
            case 3:
                System.out.println("");
                System.out.println("Ingrese la cantidad en Galones: ");
                System.out.print("||");
                double galones = scanner.nextDouble();

                double litros = galones * 3.78541;

                System.out.println("");
                System.out.println(galones + " Galones equivalen a " + litros + " Litros.");
                break;
            case 4:
                System.out.println("");
                System.out.println("Ingrese la temperatura en Fahrenheit: ");
                System.out.print("||");
                double fahrenheit = scanner.nextDouble();

                double celsius = (fahrenheit - 32) * 5 / 9;

                System.out.println("");
                System.out.println(fahrenheit + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
                break;
            case 5:
                System.out.println("");
                System.out.println("//// Ha salido del Programa ////");
                break;
            default:
                System.out.println("");
                System.out.println("//// La opcion no es valida ////");
            }
        scanner.close();
    }
}

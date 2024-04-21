import java.util.Scanner;

public class Ejercicio205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese la cantidad en bolivianos:");
        System.out.print("||");
        double bolivianos = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingrese el tipo de cambio (cantidad de bolivianos por cada dolar):");
        System.out.print("||");
        double tipoCambio = scanner.nextDouble();

        double dolares = bolivianos / tipoCambio;

        System.out.println("");
        System.out.println(bolivianos + " bolivianos equivalen a $" + dolares + " dolares.");

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio204 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor en dolares:");
        System.out.print("||");
        double dolares = scanner.nextDouble();

        double tipoCambio = 8.08;
        double bolivianos = dolares * tipoCambio;

        System.out.println("");
        System.out.println("$" + dolares + " equivale a " + bolivianos + " bolivianos.");

        scanner.close();
    }
}

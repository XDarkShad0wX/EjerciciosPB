import java.util.Scanner;

public class Ejercicio170 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Ingrese 2 fracciones (Con el mismo denominador) ////");
        System.out.println("");

        System.out.println("- Primera fraccion -");
        System.out.println("Numerador: ");
        System.out.print("||");
        int numerador1 = scanner.nextInt();

        System.out.println("");
        System.out.println("Denominador: ");
        System.out.print("||");
        int denominador1 = scanner.nextInt();

        System.out.println("");
        System.out.println("- Segunda fraccion -");
        System.out.println("Numerador: ");
        System.out.print("||");
        int numerador2 = scanner.nextInt();

        System.out.println("");
        System.out.println("Denominador: ");
        System.out.print("||");
        int denominador2 = scanner.nextInt();

        if (denominador1 != denominador2) {
            System.out.println("");
            System.out.println("//// Las fracciones deben tener el mismo denominador ////");
            return;
        }

        int sumaNumerador = numerador1 + numerador2;
        int restaNumerador = numerador1 - numerador2;

        System.out.println("");
        System.out.println("La suma de las fracciones es: " + sumaNumerador + "/" + denominador1);
        System.out.println("La resta de las fracciones es: " + restaNumerador + "/" + denominador1);

        scanner.close();
    }
}

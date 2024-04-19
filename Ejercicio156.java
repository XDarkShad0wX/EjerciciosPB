import java.util.Scanner;

public class Ejercicio156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("//// Ingrese 2 cadenas de texto ////");
        System.out.println("");

        System.out.println("- Primera cadena: ");
        System.out.print("||");
        String cadena1 = scanner.nextLine();

        System.out.println("");
        System.out.println("- Segunda cadena: ");
        System.out.print("||");
        String cadena2 = scanner.nextLine();

        String cadena1Mayusculas = cadena1.toUpperCase();
        String cadena2Mayusculas = cadena2.toUpperCase();

        if (cadena1Mayusculas.equals(cadena2Mayusculas)) {
            System.out.println("");
            System.out.println("Las dos cadenas son iguales.");
        } else {
            System.out.println("");
            System.out.println("Las dos cadenas son diferentes.");
        }

        scanner.close();
    }
}

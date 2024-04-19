import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("//// Ingrse 2 cadenas de caracteres ////");
        System.out.println("");

        System.out.println("- Primera cadena: ");
        System.out.print("||");
        String cadena1 = scanner.nextLine();

        System.out.println("");
        System.out.println("- Segunda cadena: ");
        System.out.print("||");
        String cadena2 = scanner.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("");
            System.out.println("- Las dos cadenas son iguales -");
        } else {
            System.out.println("");
            System.out.println("- Las cadenas no son iguales -");

            int comparacion = cadena1.compareTo(cadena2);
            if (comparacion < 0) {
                System.out.println("");
                System.out.println("// La primera cadena es menor alfabeticamente //");
            } else {
                System.out.println("");
                System.out.println("// La segunda cadena es menor alfabeticamente //");
            }
        }

        scanner.close();
    }
}

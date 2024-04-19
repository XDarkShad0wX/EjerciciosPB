import java.util.Scanner;

public class Ejercicio155 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        System.out.print("||");
        String palabra = scanner.nextLine();

        palabra = palabra.toLowerCase().replaceAll("\\s+", "");

        boolean esPalindromo = true;
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longitud - i - 1)) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("");
            System.out.println("La palabra \"" + palabra + "\" es un palíndromo.");
        } else {
            System.out.println("");
            System.out.println("La palabra \"" + palabra + "\" no es un palíndromo.");
        }

        scanner.close();
    }
}

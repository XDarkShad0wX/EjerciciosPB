import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio168 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vocales = new char[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("");
            System.out.println("Ingrese una vocal: ");
            System.out.print("||");
            char vocal = scanner.next().toLowerCase().charAt(0);

            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                vocales[i] = vocal;
            } else {
                System.out.println("");
                System.out.println("//// Ingrese una vocal valida ////");
            }
        }

        Arrays.sort(vocales);

        System.out.println("");
        System.out.println("\nVocales ordenadas:");
        for (char vocal : vocales) {
            System.out.print(vocal + " ");
        }

        scanner.close();
    }
}

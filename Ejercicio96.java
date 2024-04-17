import java.util.Scanner;

public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        System.out.print("||");
        String frase = scanner.nextLine();

        String[] palabras = frase.split("\\s+");

        System.out.println("");
        System.out.println("Palabras y su longitud:");
        for (String palabra : palabras) {
            System.out.println(palabra + " - " + palabra.length());
        }

        scanner.close();
    }
}

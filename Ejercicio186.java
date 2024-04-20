import java.util.Scanner;

public class Ejercicio186 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("");
        System.out.println("Ingrese una cadena de caracteres: ");
        System.out.print("||");
        String palabra = scanner.nextLine();

        System.out.println("");
        System.out.println("La palabra en orden inverso es: ");
        for (int i = palabra.length() - 1; i >= 0; i--) {
            System.out.print(palabra.charAt(i));
        }

        scanner.close();
    }
}

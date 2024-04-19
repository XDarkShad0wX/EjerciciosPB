import java.util.Scanner;

public class Ejercicio151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese una cadena de caracteres: ");
        System.out.print("||");
        String cadena = scanner.nextLine();

        if (cadena.length() > 10) {
            System.out.println("");
            System.out.println("La cadena supera los 10 caracteres:");
            System.out.println(cadena);
        } else {
            System.out.println("");
            System.out.println("La cadena no supera los 10 caracteres.");
        }

        scanner.close();
    }
}

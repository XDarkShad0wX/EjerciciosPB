import java.util.Scanner;

public class Ejercicio157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre (en MAYUSCULAS): ");
        System.out.print("||");
        String nombre = scanner.nextLine();

        if (nombre.startsWith("A")) {
            nombre = nombre.toLowerCase();
            System.out.println("");
            System.out.println("El nombre convertido a minusculas es: " + nombre);
        } else {
            System.out.println("");
            System.out.println("No se puede conviertir a minusculas (No comienza por la letra 'A')");
        }

        scanner.close();
    }
}

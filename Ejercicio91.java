import java.util.Scanner;

public class Ejercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        System.out.print("||");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su apellido: ");
        System.out.print("||");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        System.out.print("||");
        int edad = scanner.nextInt();

        System.out.println("Ingrese su número de celular: ");
        System.out.print("||");
        long celular = scanner.nextLong();

        System.out.println("");
        System.out.println("/////////// Datos ///////////");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Numero de celular: " + celular);

        scanner.close();
    }
}

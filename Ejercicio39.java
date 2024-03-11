import java.util.Scanner;
public class Ejercicio39 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        System.out.print("||");
        String nom = scanner.nextLine();

        System.out.println("Ingrese el año de nacimiento");
        System.out.print("||");
        int añoN = scanner.nextInt();

        System.out.println("Ingrese su edad actual");
        System.out.print("||");
        int edad = scanner.nextInt();

        float porcentaje = 0.34f;
        int añoA = (edad + añoN);
        int totalDormido = (int) ((añoA - añoN) * 365 * porcentaje);

        System.out.println("..............................................");
        System.out.println("- Nombre: " + nom);
        System.out.println("- Edad: " + edad);
        System.out.println("- Total de dias dormido es de: " + totalDormido);

        scanner.close();
    }
}

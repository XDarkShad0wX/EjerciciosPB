import java.util.Scanner;

public class Ejercicio184 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("//// Ingrese los siguientes datos para generar la CURP ////");
        System.out.println("");

        System.out.println("- Nombre o razon social: ");
        System.out.print("||");
        String nombre = scanner.nextLine().toUpperCase();

        System.out.println("");
        System.out.println("- Fecha de nacimiento o constitucion (AAAA-MM-DD): ");
        System.out.print("||");
        String fecha = scanner.nextLine();

        StringBuilder iniciales = new StringBuilder();
        String[] palabras = nombre.split("\\s+");
        for (String palabra : palabras) {
            iniciales.append(palabra.charAt(0));
        }

        String fechaRFC = fecha.replace("-", "").substring(2);
        String homoclave = "XXX";
        String rfc = iniciales.toString() + fechaRFC + homoclave;

        System.out.println("");
        System.out.println("\nEl RFC generado es: " + rfc);

        scanner.close();
    }
}

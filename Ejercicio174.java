import java.util.Scanner;

public class Ejercicio174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese su nombre real: ");
        System.out.print("");
        String nombreReal = scanner.nextLine();

        System.out.println("");
        System.out.println("Ingrese el area o departamento: ");
        System.out.print("||");
        String departamento = scanner.nextLine();

        String[] partesNombre = nombreReal.split("\\s+");

        StringBuilder nombreUsuario = new StringBuilder();

        for (String palabra : departamento.split("\\s+")) {
            nombreUsuario.append(palabra.charAt(0));
        }

        for (String parte : partesNombre) {
            nombreUsuario.append(parte.charAt(0));
        }

        System.out.println("");
        System.out.println("- El nombre de usuario generado es: " + nombreUsuario.toString().toLowerCase());

        scanner.close();
    }
}

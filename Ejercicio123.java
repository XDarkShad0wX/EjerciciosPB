import java.util.Scanner;

public class Ejercicio123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un capital inicial: ");
        System.out.print("||");
        float capital = scanner.nextFloat();

        System.out.println("");
        System.out.println("Ingrese la tasa de interes (eporcentaje en decimal): ");
        System.out.print("||");
        float porcentaje = scanner.nextFloat();

        System.out.println("");
        System.out.println("Ingrese el número de días: ");
        System.out.print("||");
        int dias = scanner.nextInt();

        float tasaInteresDecimal = porcentaje / 100;
        float interesSimple = capital * tasaInteresDecimal * dias;
        float capitalFinal = capital + interesSimple;

        System.out.println("");
        System.out.println("El capital despues de " + dias + " dias es de: " + capitalFinal);

        scanner.close();
    }
}

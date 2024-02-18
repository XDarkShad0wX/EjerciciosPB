import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] arg) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese los datos para calcular el area de un rectangulo ///");
        System.out.println("");
        System.out.println("- Longitud del rectangulo: ");
        System.out.print("||");
        float longitud = scanner.nextFloat();

        System.out.println("- Anchura del rectangulo: ");
        System.out.print("||");
        float ancho = scanner.nextFloat();

        float area = longitud * ancho;

        System.out.println("El area del rectangulo es de: " + area);

        scanner.close();
    }
}
import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("/// Ingrese los datos para calcular el área de un rectángulo ///");
        System.out.println("");

        System.out.println("- Longitud del rectángulo: ");
        System.out.print("||");
        float longitud = scanner.nextFloat();

        System.out.println("- Anchura del rectángulo: ");
        System.out.print("||");
        float ancho = scanner.nextFloat();

        float milimetros = longitud * ancho;
        float centimetros = milimetros / 100;
        float metros = milimetros / 1000000;
        
        System.out.println("El área del rectángulo es de: ");
        System.out.println("- " + milimetros + " milímetros cuadrados");
        System.out.println("- " + centimetros + " centímetros cuadrados");
        System.out.println("- " + metros + " metros cuadrados");
        scanner.close();
    }
}
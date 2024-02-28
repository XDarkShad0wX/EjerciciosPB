import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del Triángulo en milímetros: ");
        System.out.print("||");
        float baseT = scanner.nextFloat();
        System.out.println("Ingrese la altura del Triángulo en milímetros: ");
        System.out.print("||");
        float alturaT = scanner.nextFloat();

        float milimetro = (baseT * alturaT) / 2;
        float centimetros = milimetro / 100;
        float metros = milimetro / 1000000;

        System.out.println("El área del Triángulo es de: ");
        System.out.println("- " + milimetro + " milímetros cuadrados");
        System.out.println("- " + centimetros + " centímetros cuadrados");
        System.out.println("- " + metros + " metros cuadrados");

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado del Triangulo Equilátero: ");
        System.out.print("||");
        double lado = scanner.nextDouble();

        float area = (float) ((Math.sqrt(3) / 4) * lado * lado);

        if (area > 1000) {
            System.out.println("");
            System.out.println("DATOS NO VÁLIDOS");
        } else {
            System.out.println("");
            System.out.println("El área del triángulo equilátero es: " + area);
        }

        scanner.close();
    }
}

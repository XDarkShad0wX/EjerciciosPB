import java.util.Scanner;

public class Ejercicio145 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("///// Ingrese las longitudes de los lados del triángulo /////");
        System.out.println("");

        System.out.println("- Lado 1: ");
        System.out.print("||");
        double lado1 = scanner.nextDouble();

        System.out.println("");
        System.out.println("- Lado 2: ");
        System.out.print("||");
        double lado2 = scanner.nextDouble();

        System.out.println("");
        System.out.println("- Lado 3: ");
        System.out.print("||");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("");
                System.out.println("El triángulo es equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("");
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("");
            System.out.println("//// Los lados no forman un triángulo ////");
        }

        scanner.close();
    }
}

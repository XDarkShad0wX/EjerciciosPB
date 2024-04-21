import java.util.Scanner;

public class Ejercicio203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese su edad:");
        System.out.print("||");
        int edad = scanner.nextInt();

        double pulsaciones = (220.0 - edad) / 10;

        System.out.println("");
        System.out.println("El numero de pulsaciones por cada 10 segundos de ejercicio es: " + pulsaciones);

        scanner.close();
    }
}

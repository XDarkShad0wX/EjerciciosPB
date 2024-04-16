import java.util.Scanner;

public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el voltaje en voltios para el bombillo");
        System.out.println("||");
        double voltaje = scanner.nextDouble();

        double voltajeK = voltaje / 1000;
        double voltajeTotal = 3 * voltajeK;

        System.out.println("");
        System.out.println("El voltaje total de los tres bombillos es: " + voltajeTotal + " kilovoltios");

        scanner.close();
    }
}

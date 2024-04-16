import java.util.Scanner;

public class Ejercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el voltaje en voltios para el bombillo:");
        double voltajeBombillo = scanner.nextDouble();

        scanner.close();

        // Convertir voltaje de bombillo a kilovoltios
        double voltajeKilovoltios = voltajeBombillo / 1000;

        // Calcular y visualizar el voltaje total de los tres bombillos en kilovoltios
        double voltajeTotal = 3 * voltajeKilovoltios;
        System.out.println("El voltaje total de los tres bombillos es: " + voltajeTotal + " kilovoltios.");
    }
}

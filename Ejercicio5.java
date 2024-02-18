import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de la primera diagonal del Rombo: ");
        System.out.print("||");
        float d1 = scanner.nextFloat();

        System.out.println("Ingrese la longitud de la segunda diagonal del Rombo: ");
        System.out.print("||");
        float d2 = scanner.nextFloat();

        float area = (d1 * d2) / 2;

        System.out.println("El área del Rombo es: " + area);

        scanner.close();
    }
}

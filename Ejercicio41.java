import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la edad");
        System.out.print("||");
        int edad = scanner.nextInt();

        float año = 12 * 0.01f;

        float cabelloMT = año * edad;

        System.out.println("El cabello miide " + cabelloMT + " Metros");

        scanner.close();
    }
}

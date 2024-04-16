import java.util.Scanner;

public class Ejercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        System.out.print("||");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;

        if (area > 5000) {
            System.out.println("DATOS ERRÓNEOS");
        } else {
            System.out.println("El area del círculo es: " + area);
        }

        scanner.close();
    }
}

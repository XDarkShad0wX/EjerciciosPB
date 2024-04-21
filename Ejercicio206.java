import java.util.Scanner;

public class Ejercicio206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el salario anterior del obrero:");
        System.out.print("||");
        double salarioAnterior = scanner.nextDouble();

        double incremento = 0.25 * salarioAnterior;

        double nuevoSalario = salarioAnterior + incremento;

        System.out.println("");
        System.out.println("El nuevo salario del obrero es: " + nuevoSalario);

        scanner.close();
    }
}

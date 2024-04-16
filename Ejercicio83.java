import java.util.Scanner;

public class Ejercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese 3 numeros ///");
        System.out.println("");

        System.out.println("numero 1: ");
        System.out.print("||");
        float num1 = scanner.nextFloat();

        System.out.println("numero 2: ");
        System.out.print("||");
        float num2 = scanner.nextFloat();

        System.out.println("numero 3: ");
        System.out.print("||");
        float num3 = scanner.nextFloat();

        float promedio = (num1 + num2 + num3) / 3;

        if (promedio > 7) {
            System.out.println("APROBADO");
        } else {
            System.out.println("MEJORE LA NOTA");
        }

        scanner.close();
    }
}

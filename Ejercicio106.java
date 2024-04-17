import java.util.Scanner;

public class Ejercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        System.out.print("");
        int m = scanner.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        System.out.print("");
        int n = scanner.nextInt();

        int mcd = m;
        int resto = n;

        while (resto != 0) {
            int temp = resto;
            resto = mcd % resto;
            mcd = temp;
        }

        System.out.println("");
        System.out.println("El máximo común divisor de " + m + " y " + n + " es: " + mcd);

        scanner.close();
    }
}

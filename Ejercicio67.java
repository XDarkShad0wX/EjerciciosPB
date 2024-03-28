import java.util.Scanner;
public class Ejercicio67 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n)");
        System.out.print("||");
        int n = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;

        }

        System.out.println("");
        System.out.println("El factorial de N = " + n + " es igual a: " + factorial);

        scanner.close();
    }
}

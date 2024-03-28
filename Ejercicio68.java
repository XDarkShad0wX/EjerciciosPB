import java.util.Scanner;
public class Ejercicio68 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n)");
        System.out.print("||");
        int n = scanner.nextInt();

        int factorial = 1;
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
            suma += factorial;
        }

        System.out.println("");
        System.out.println("La suma de factoriales de N = " + n + " es igual a: " + suma);

        scanner.close();
    }
}

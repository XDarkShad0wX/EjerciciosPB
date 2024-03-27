import java.util.Scanner;
public class Ejercicio65 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n)");
        System.out.print("||");
        int n = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("");
        System.out.println("La suma de los numeros del 1 hasta n = " + n + " es igual a: " + suma);

        scanner.close();
    }
}

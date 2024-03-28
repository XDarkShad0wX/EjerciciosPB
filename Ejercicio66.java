import java.util.Scanner;
public class Ejercicio66 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n)");
        System.out.print("||");
        int n = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= n; i++) {
            int numeroImpar = 2 * i - 1;
            suma += numeroImpar;
        }

        System.out.println("La suma de los números (impares hasta " + (2 * n - 1) + ") de: " + suma);

        scanner.close();
    }
}

import java.util.*;
public class Ejercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n):");
        System.out.print("||");
        int n = scanner.nextInt();

        int suma = 0;

        for (int i = 21; i <= n; i++) {
            suma += i;
        }


        System.out.println("");
        System.out.println("La suma desde 21 hasta N = " + n + " es igual a: " + suma);

        scanner.close();
    }
}

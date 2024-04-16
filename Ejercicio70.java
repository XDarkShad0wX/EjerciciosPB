import java.util.*;
public class Ejercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n):");
        System.out.print("||");
        int n = scanner.nextInt();

        int resultado = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                resultado -= i;
            } else {
                resultado += i;
            }
        }

        System.out.println("El resultado de la operacion es: " + resultado);

        scanner.close();
    }
}
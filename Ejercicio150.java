import java.util.Scanner;

public class Ejercicio150 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Ingrese un numero entero positivo mayor que 1 ////");
        System.out.print("||");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("");
            System.out.println("//!// El numero debe ser mayor que 1 //!//");
            return;
        }

        System.out.println("");
        System.out.print("Descomposición en factores primos de " + numero + ": ");

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                System.out.print(i);
                numero /= i;
                if (numero != 1) {
                    System.out.print(" * ");
                }
            }
        }

        scanner.close();
    }
}

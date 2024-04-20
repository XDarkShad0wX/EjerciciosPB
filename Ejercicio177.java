import java.util.Scanner;

public class Ejercicio177 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero (entero positivo): ");
        System.out.print("||");
        int numero = scanner.nextInt();

        System.out.println("");
        System.out.print("Los divisores de " + numero + " son: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

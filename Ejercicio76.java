import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        scanner.close();

        int cifras = 0;
        // Manejo de números negativos
        if (numero < 0) {
            numero *= -1;
        }

        // Bucle para contar las cifras
        while (numero > 0) {
            numero /= 10;
            cifras++;
        }

        System.out.println("El número de cifras es: " + cifras);
    }
}

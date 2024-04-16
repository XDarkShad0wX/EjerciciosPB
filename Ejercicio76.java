import java.util.Scanner;

public class Ejercicio76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero");
        System.out.print("||");
        int numero = scanner.nextInt();

        int cifras = 0;

        if (numero < 0) {
            numero *= -1;
        }

        while (numero > 0) {
            numero /= 10;
            cifras++;
        }

        System.out.println("El número de cifras es: " + cifras);

        scanner.close();
    }
}

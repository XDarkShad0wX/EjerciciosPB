import java.util.Scanner;

public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero: ");
        System.out.print("||");
        int numero = scanner.nextInt();

        int valorAbsoluto = Math.abs(numero);

        System.out.println("");
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);

        scanner.close();
    }
}

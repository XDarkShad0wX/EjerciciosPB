import java.util.Scanner;

public class Ejercicio125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero para ver sus multiplos: ");
        System.out.print("||");
        int numero = scanner.nextInt();

        System.out.println("");
        System.out.println("Multiplos de " + numero + " hasta 3000:");

        for (int i = numero; i <= 3000; i += numero) {
            System.out.println(i);
        }

        scanner.close();
    }
}

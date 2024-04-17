import java.util.Scanner;

public class Ejercicio117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 0;

        while (true) {
            System.out.println("Ingrese un numero (0 para finalizar el programa): ");
            System.out.print("");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            contador++;
        }

        System.out.println("");
        System.out.println("Has ingresado " + contador + " numeros.");

        scanner.close();
    }
}

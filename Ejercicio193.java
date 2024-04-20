import java.util.Scanner;

public class Ejercicio193 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un número entre 1 y 255:");
        System.out.print("||");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 255) {
            System.out.println("");
            System.out.println("/// El numero debe estar entre 1 y 255 ///");
            return;
        }

        StringBuilder binario = new StringBuilder();
        int numeroOriginal = numero;
        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero /= 2;
        }

        System.out.println("");
        System.out.println("El numero " + numeroOriginal + " en binario es: " + binario);

        scanner.close();
    }
}

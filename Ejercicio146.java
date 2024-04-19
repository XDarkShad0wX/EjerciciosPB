import java.util.Scanner;
public class Ejercicio146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el limite para la serie Fibonacci: ");
        System.out.print("||");
        int limite = scanner.nextInt();

        System.out.println("");
        System.out.println("Serie Fibonacci hasta " + limite + ":");

        int numeroAnterior = 0;
        int numeroActual = 1;

        while (numeroActual <= limite) {
            System.out.println("");
            System.out.print(numeroActual + " ");

            int siguienteNumero = numeroAnterior + numeroActual;
            numeroAnterior = numeroActual;
            numeroActual = siguienteNumero;
        }

        scanner.close();
    }
}

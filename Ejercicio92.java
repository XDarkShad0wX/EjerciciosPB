import java.util.Scanner;

public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de los vectores: ");
        System.out.print("||");
        int tamaño = scanner.nextInt();

        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];

        System.out.println("/// Ingrese los elementos de los vectores ///");

        System.out.println("- Primer vector:");
        System.out.print("||");

        for (int i = 0; i < tamaño; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("- Segundo vector:");
        System.out.print("||");

        for (int i = 0; i < tamaño; i++) {
            vector2[i] = scanner.nextInt();
        }

        int productoEscalar = 0;
        for (int i = 0; i < tamaño; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }

        System.out.println("El producto escalar del vector 1 y 2 es: " + productoEscalar);

        scanner.close();
    }
}

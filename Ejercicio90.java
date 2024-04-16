import java.util.Scanner;

public class Ejercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el tamaño de la matriz (filas y columnas):");
        System.out.print("||");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();
        int[][] matriz = new int[filas][columnas];

        System.out.println("");
        System.out.println("Ingrese los elementos de la matriz:");
        System.out.print("||");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("");
        System.out.println("Ingrese el tamaño del vector");
        System.out.print("||");
        int tamaño = scanner.nextInt();
        int[] vector = new int[tamaño];

        System.out.println("");
        System.out.println("Ingrese los elementos del vector");
        System.out.print("||");

        for (int i = 0; i < tamaño; i++) {
            vector[i] = scanner.nextInt();
        }

        int primosM = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (Primo(matriz[i][j])) {
                    primosM++;
                }
            }
        }

        int primosVector = 0;
        for (int num : vector) {
            if (Primo(num)) {
                primosVector++;
            }
        }

        System.out.println("");
        System.out.println("La cantidad de números primos en la matriz es: " + primosM);
        System.out.println("La cantidad de números primos en el vector es: " + primosVector);

        scanner.close();
    }

    public static boolean Primo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

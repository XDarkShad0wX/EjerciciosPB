import java.util.Scanner;

public class Ejercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector: ");
        System.out.print("||");
        int tamaño = scanner.nextInt();

        int[] vector = new int[tamaño];

        System.out.println("");
        System.out.println("Ingrese los elementos del vector:");
        System.out.print("||");
        for (int i = 0; i < tamaño; i++) {
            vector[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamaño - 1; i++) {
            for (int j = 0; j < tamaño - i - 1; j++) {
                if (vector[j] < vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("");
        System.out.println("El vector ordenado de mayor a menor es:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(vector[i] + " ");
        }

        scanner.close();
    }
}

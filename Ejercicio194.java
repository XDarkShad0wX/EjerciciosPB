import java.util.Scanner;

public class Ejercicio194 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("");
        System.out.println("/// Ingrese 10 numeros ///");
        System.out.println("");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("- Numero " + (i + 1) + ": ");
            System.out.print("||");
            numeros[i] = scanner.nextInt();
        }

        ordenarBurbuja(numeros);

        System.out.println("");
        System.out.println("- \nNúmeros ordenados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        scanner.close();
    }

    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Se intercambian elementos si esta mal el orden
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }
}

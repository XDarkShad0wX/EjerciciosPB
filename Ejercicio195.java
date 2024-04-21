import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arreglo = generarArregloOrdenado(20);

        System.out.println("");
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));

        System.out.println("\nIngrese el elemento a buscar:");
        System.out.print("||");
        int elementoABuscar = scanner.nextInt();

        int comparaciones = busquedaBinaria(arreglo, elementoABuscar);

        if (comparaciones != -1) {
            System.out.println("");
            System.out.println("\nElemento encontrado: " + elementoABuscar);
            System.out.println("Cantidad de comparaciones realizadas: " + comparaciones);
        } else {
            System.out.println("");
            System.out.println("//// No se encontro en el arreglo ////");
        }

        scanner.close();
    }

    public static int[] generarArregloOrdenado(int tamaño) {
        int[] arreglo = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = i + 1;
        }
        return arreglo;
    }

    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int comparaciones = 0;
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == elemento) {
                comparaciones++;
                return comparaciones;
            }

            if (arreglo[medio] < elemento) {
                comparaciones++;
                izquierda = medio + 1;
            }
            else {
                comparaciones++;
                derecha = medio - 1;
            }
        }

        return -1;
    }
}

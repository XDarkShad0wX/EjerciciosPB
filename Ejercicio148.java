import java.util.Scanner;

public class Ejercicio148 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        System.out.print("||");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("");
            System.out.println("//// La cantidad debe ser un numero positivo ////");
            return;
        }

        double[] numeros = new double[cantidad];

        System.out.println("");
        System.out.println("//// Ingrese los numeros ////");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("");
            System.out.println("Número " + (i + 1) + ": ");
            System.out.print("||");
            numeros[i] = scanner.nextDouble();
        }

        double suma = 0;
        double maximo = numeros[0];
        double minimo = numeros[0];

        for (double numero : numeros) {
            suma += numero;
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
        }

        double promedio = suma / cantidad;

        System.out.println("");
        System.out.println("- Suma: " + suma);
        System.out.println("- Promedio: " + promedio);
        System.out.println("- Maximo: " + maximo);
        System.out.println("- Minimo: " + minimo);

        scanner.close();
    }
}

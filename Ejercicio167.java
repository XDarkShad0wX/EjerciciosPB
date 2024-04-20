import java.util.Scanner;

public class Ejercicio167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("//// Ingrese una lista de numeros positivos (Ingrese 0 para terminar) ////");

        int suma = 0;
        int cantidadNumeros = 0;

        while (true) {
            System.out.println("");
            System.out.println("Ingrese un numero: ");
            System.out.print("||");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > 0) {
                suma += numero;
                cantidadNumeros++;
            } else {
                System.out.println("");
                System.out.println("//// Ingrese un numero positivo ////");
            }
        }

        if (cantidadNumeros > 0) {
            double promedio = (double) suma / cantidadNumeros;
            System.out.println("");
            System.out.println("El promedio de los numeros ingresados es: " + promedio);
        } else {
            System.out.println("");
            System.out.println("No se ingresaron numeros positivos.");

            scanner.close();
        }
    }
}

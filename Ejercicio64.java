import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio64 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int numElv = 0;

        while (true) {
            try {
                System.out.println("");
                System.out.println("Ingrese un numero entero (puede ser positivo o 0):");
                System.out.print("||");
                num = scanner.nextInt();

                if (num >= 0) {
                    break;
                } else {
                    System.out.println("");
                    System.out.println("/// Solo numeros enteros positivos o 0 ///");
                }

            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("/// Solo numeros validos ///");
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.println("");
                System.out.println("Ingrese un numero que eleva al primer numero (Entero):");
                System.out.print("||");
                numElv = scanner.nextInt();

                if (numElv >= 0) {
                    break;
                } else {
                    System.out.println("");
                    System.out.println("/// Solo numeros enteros positivos o 0 ///");
                }

            } catch (InputMismatchException e) {
                System.out.println("");
                System.out.println("/// Solo numeros validos ///");
                scanner.next();
            }
        }

        int resultado = 1;

        for (int i = 0; i < numElv; i++) {
            resultado *= num;
        }

        System.out.println("");
        System.out.println("El resultado de " + num + " elevado a la " + numElv + " potencia es: " + resultado);

        scanner.close();
    }
}

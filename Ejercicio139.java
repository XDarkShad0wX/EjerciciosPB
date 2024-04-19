import java.util.Scanner;

public class Ejercicio139 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero (entero positivo) para calcular su factorial: ");
        System.out.print("||");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("");
            System.out.println("//// El numero debe ser positivo ////");
        } else {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            System.out.println("");
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}

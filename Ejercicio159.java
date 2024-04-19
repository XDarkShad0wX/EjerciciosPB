import java.util.Scanner;

public class Ejercicio159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        System.out.print("||");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("");
            System.out.println("El numero" + numero + " no es primo.");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("");
                System.out.println("El numero" + numero + " es primo.");
            } else {
                System.out.println("");
                System.out.println("El numero" + numero + " no es primo.");
            }
        }

        scanner.close();
    }
}

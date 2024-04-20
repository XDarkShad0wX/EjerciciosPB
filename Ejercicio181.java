import java.util.Scanner;

public class Ejercicio181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero: ");
        System.out.print("||");
        int numero = scanner.nextInt();

        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }


        boolean esPerfecto = (sumaDivisores == numero);

        if (esPerfecto) {
            System.out.println("");
            System.out.println("El numero " + numero + " es un numero perfecto.");
        } else {
            System.out.println("");
            System.out.println("El numero " + numero + " no es un numero perfecto.");
        }

        scanner.close();
    }
}

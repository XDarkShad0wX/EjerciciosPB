import java.util.Scanner;

public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese dos numeros ///");
        System.out.println("");

        System.out.println("- Primer numero: ");
        System.out.print("||");
        int numero1 = scanner.nextInt();

        System.out.println("");
        System.out.print("- Segundo numero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        if (suma % 2 == 0) {
            System.out.println("");
            System.out.println("La suma de los numeros " + numero1 + " y " + numero2 + " es par.");
        } else {
            System.out.println("");
            System.out.println("La suma de los numeros " + numero1 + " y " + numero2 + " es impar.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese dos numeros ///");
        System.out.println("");

        System.out.println("- Primer nmero: ");
        System.out.print("||");
        int numero1 = scanner.nextInt();

        System.out.println("- Segundo numero: ");
        System.out.print("||");
        int numero2 = scanner.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.println("");
            System.out.println("El numero " + numero1 + " es divisible por " + numero2);
        } else {
            System.out.println("");
            System.out.println("El numero " + numero1 + " no es divisible por " + numero2);
        }

        scanner.close();
    }
}

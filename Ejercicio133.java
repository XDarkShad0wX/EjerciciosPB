import java.util.Scanner;

public class Ejercicio133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("/// Ingrese dos numeros ///");
        System.out.println("");

        System.out.println("- Primer numero entero: ");
        System.out.print("||");
        int numero1 = scanner.nextInt();

        System.out.println("");
        System.out.println("- Segundo numero entero: ");
        System.out.print("||");
        int numero2 = scanner.nextInt();

        int mayor, menor;

        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }

        System.out.println("");
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        scanner.close();
    }
}

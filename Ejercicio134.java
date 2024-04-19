import java.util.Scanner;

public class Ejercicio134 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese 3 numeros enteros diferentes ///");
        System.out.println("");

        System.out.println("numero 1: ");
        System.out.print("||");
        float numero1 = scanner.nextFloat();

        System.out.println("");
        System.out.println("numero 2: ");
        System.out.print("||");
        float numero2 = scanner.nextFloat();

        System.out.println("");
        System.out.println("numero 3: ");
        System.out.print("||");
        float numero3 = scanner.nextFloat();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("");
            System.out.println("//// Los números no pueden ser iguales ////");
            return;
        }

        int mayor = (int) (Math.max(Math.max(numero1, numero2), numero3));
        int menor = (int) (Math.min(Math.min(numero1, numero2), numero3));

        System.out.println("");
        System.out.println("- El numero mayor es: " + mayor);
        System.out.println("- El numero menor es: " + menor);

        scanner.close();
    }
}

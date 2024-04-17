import java.util.Scanner;

public class Ejercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("//// Ingrese 3 numeros ////");
        System.out.println("");

        System.out.println("numero 1: ");
        System.out.print("||");
        float numero1 = scanner.nextFloat();

        System.out.println("numero 2: ");
        System.out.print("||");
        float numero2 = scanner.nextFloat();

        System.out.println("numero 3: ");
        System.out.print("||");
        float numero3 = scanner.nextFloat();

        double menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        System.out.println("");
        System.out.println("El número menor ingresado es: " + menor);

        scanner.close();
    }
}

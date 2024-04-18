import java.util.Scanner;

public class Ejercicio121 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("//// Ingrese 5 numeros ////");

        int sumaTotal = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            System.out.println("- Numero " + i + ": ");
            System.out.print("||");
            int numero = scanner.nextInt();

            sumaTotal += numero;
        }

        System.out.println("");
        System.out.println("La suma de los numeros es: " + sumaTotal);

        scanner.close();
    }
}

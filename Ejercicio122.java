import java.util.Scanner;

public class Ejercicio122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cualquier numero (0 para finalizar el programa): ");

        int contador = 1;
        int sumaTotal = 0;
        while (true) {
            System.out.println("");
            System.out.println("[" + contador + "]- Numero: ");
            System.out.print("||");
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }
            sumaTotal += numero;

            contador++;
        }

        System.out.println("");
        System.out.println("La suma de los numeros es de: " + sumaTotal);

        scanner.close();
    }
}

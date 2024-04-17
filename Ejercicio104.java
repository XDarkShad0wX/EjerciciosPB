import java.util.Scanner;

public class Ejercicio104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        System.out.print("||");
        double numero = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ahora ingrese el indice de la raiz: ");
        System.out.print("||");
        double indice = scanner.nextDouble();

        double resultado = Math.pow(numero, 1 / indice);

        System.out.println("");
        System.out.println("La raiz " + indice + " del número " + numero + " es: " + resultado);

        scanner.close();
    }
}

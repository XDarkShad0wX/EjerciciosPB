import java.util.Scanner;

public class Ejercicio135 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese una cantidad de numeros para comparar: ");
        System.out.print("||");
        int cantidadNumeros = scanner.nextInt();

        if (cantidadNumeros <= 0) {
            System.out.println("");
            System.out.println("//// La cantidad debe ser mayor que 0 ////");
            return;
        }

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println("");
            System.out.println("[" + i + "]- Numero: ");
            System.out.print("||");
            int numero = scanner.nextInt();

            mayor = Math.max(mayor, numero);
            menor = Math.min(menor, numero);
        }

        System.out.println("");
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}

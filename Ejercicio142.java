import java.util.Scanner;

public class Ejercicio142 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número base y el exponente
        System.out.print("Ingrese el número base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese el exponente: ");
        int exponente = scanner.nextInt();

        // Verificar si el exponente es negativo
        boolean esNegativo = exponente < 0;
        exponente = Math.abs(exponente);

        // Calcular la potencia utilizando un bucle
        double resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        // Si el exponente es negativo, calcular la inversa de la potencia
        if (esNegativo) {
            resultado = 1 / resultado;
        }

        // Mostrar el resultado
        System.out.println(base + " elevado a la potencia " + exponente + " es igual a: " + resultado);

        // Cerrar el scanner
        scanner.close();
    }
}

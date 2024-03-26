import java.util.Scanner;

public class Ejercicio57 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero para sumar sus digitos");
        System.out.print("||");
        int num = scanner.nextInt();

        int numTemporal = num;
        int cantidadDigitos = 0;

        while (numTemporal != 0) {
            numTemporal /= 10;
            cantidadDigitos++;
        }

        System.out.println("");
        System.out.print("- La suma de los numeros ");

        int divisor = (int) Math.pow(10, cantidadDigitos - 1);
        int suma = 0;

        while (divisor != 0) {
            int digito = num / divisor;
            suma += digito;

            System.out.print(digito);

            num %= divisor;
            divisor /= 10;

            if (divisor != 0) {
                System.out.print(" + ");
            }
        }

        System.out.println(" es: " + suma);

        scanner.close();
    }
}

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros: ");
        System.out.println("");

        System.out.println("numero 1: ");
        System.out.print("||");
        float num1 = scanner.nextFloat();

        System.out.println("numero 2: ");
        System.out.print("||");
        float num2 = scanner.nextFloat();

        System.out.println("numero 3: ");
        System.out.print("||");
        float num3 = scanner.nextFloat();

        float promedio = (num1 + num2 + num3) / 3;
        float suma = (num1 + num2 + num3);
        float duplicado = num1 * 2;
        float triplicado = num2 * 3;
        float cuadrado = (float) (Math.PI * Math.pow(num3, 2));

        System.out.println("Los calculos son: ");
        System.out.println("");
        System.out.println("- Promedio de " + num1 + ", " + num2 + " y " + num3 + " es de: " + promedio);
        System.out.println("- La suma de los 3 numeros es: " + suma);
        System.out.println("- El doble de " + num1 + " es de: " + duplicado);
        System.out.println("- El triple de " + num2 + " es de: " + triplicado);
        System.out.println("- El numero " + num3 + " al cuadrado es de: " + cuadrado);
        System.out.println("-----------------------------------------------------------------------------");

        scanner.close();
    }
}

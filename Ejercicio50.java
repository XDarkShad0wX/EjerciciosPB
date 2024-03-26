import java.util.Scanner;
public class Ejercicio50 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("-- Ingrese tres numeros enteros para hacer sus operaciones (Suma y Multiplicacion) --");
        System.out.println("");

        System.out.println("Primer Numero: ");
        System.out.print("||");
        float num1 = scanner.nextFloat();

        System.out.println("Segundo Numero: ");
        System.out.print("||");
        float num2 = scanner.nextFloat();

        System.out.println("Tercer Numero: ");
        System.out.print("||");
        float num3 = scanner.nextFloat();

        float suma = num1 + num2 + num3;
        float multiplicacion = num1 * num2 * num3;

        System.out.println("");
        System.out.println("La suma de los tres numeros es: " + suma);
        System.out.println("La Multiplicacion de los tres numeros es: " + multiplicacion);

        scanner.close();
    }
}

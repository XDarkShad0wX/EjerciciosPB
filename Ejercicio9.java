import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para calcular el IVA: ");
        System.out.print("||");
        float cantidad = scanner.nextFloat();

        System.out.println("Ingrese la tasa de IVA (en decimal): ");
        System.out.print("||");
        float tasaIVA = scanner.nextFloat();

        float IVA = cantidad * tasaIVA;

        System.out.println("El IVA es de: " + IVA);

        scanner.close();
    }
}
import java.util.Scanner;

public class Ejercicio53 {
    public static void main(String[] arg) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese los datos para calcular el area de un cuadrado ///");
        System.out.println("");
        System.out.println("- Lado del cuadrado: ");
        System.out.print("||");
        float lado = scanner.nextFloat();

        float area = (float) Math.pow(lado, 2);

        System.out.println("");
        System.out.println("El area del cuadrado es de: " + area);

        scanner.close();
    }
}
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero (real)");
        System.out.print("||");
        float num = scanner.nextFloat();

        float CuboX = (float) ((Math.pow(num, 3)));

        System.out.println("El cubo de " + num + " es: " + CuboX);

        scanner.close();
    }
}

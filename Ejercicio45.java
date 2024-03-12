import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        System.out.print("||");
        float num = scanner.nextFloat();

        int result;

        if (num < 0) {
            result = -1;
        } else if (num > 0) {
            result = 1;
        } else {
            result = 0;
        }

        System.out.println("El número " + num + " es: " + result);

        scanner.close();
    }
}

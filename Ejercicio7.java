import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        System.out.print("||");
        float num = scanner.nextFloat();

        if (num < 0) {
            System.out.println("Su numero es Negativo");
        } else {
            System.out.println("Su numero es Positivo");
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor para A");
        System.out.print("||");
        int a = scanner.nextInt();

        System.out.println("Ingrese un valor para B");
        System.out.print("||");
        int b = scanner.nextInt();

        int x = a;

        a = b;

        b = x;

        System.out.println("Ahora el valores de A el: " + a);
        System.out.println("Ahora el valores de B es: " + b);

        scanner.close();
    }
}
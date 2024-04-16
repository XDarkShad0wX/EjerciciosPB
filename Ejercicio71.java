import java.util.Scanner;
public class Ejercicio71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el valor de (n):");
        System.out.print("||");
        int n = scanner.nextInt();

        System.out.println("Serie Fibonacci hasta el numero " + n + ":");

        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        scanner.close();
    }
}

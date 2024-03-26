import java.util.Scanner;
public class Ejercicio52 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("- Ingrese un numero para mostrar su tabla de multiplicar -");
        System.out.print("||");
        int num = scanner.nextInt();

        int x;

        for (int i = 0; i <= 10; i++) {
            x = num * i;
            System.out.println(num + " x " + i + " = " + x);
        }

        scanner.close();
    }
}

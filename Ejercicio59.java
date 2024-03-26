import java.util.Scanner;
public class Ejercicio59 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero del 1 al 10 para mostrar su tabla de multiplicar");
        System.out.print("||");
        int num = scanner.nextInt();

        if (num <=10 && num > 0) {

            int x;

            for (int i = 0; i <= 10; i++) {
                x = num * i;
                System.out.println(num + " x " + i + " = " + x);
            }

        } else {
            System.out.println("");
            System.out.println("/// Solo numeros del 1 al 10 ///");
        }

        scanner.close();
    }
}

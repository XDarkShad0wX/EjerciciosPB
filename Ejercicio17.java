import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Digite 2 numeros ///");
        System.out.println("");

        System.out.println("Primer numero: ");
        System.out.print("||");
        float num1 = scanner.nextFloat();

        System.out.println("Segundo numero: ");
        System.out.print("||");
        float num2 = scanner.nextFloat();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor");
        } else {
            System.out.println("El numero " + num2 + " es mayor");
        }

        scanner.close();
    }
}

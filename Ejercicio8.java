import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese dos numero para dividirlos y sacar el residuo ///");
        System.out.println("");

        System.out.println("primer numero: ");
        System.out.print("||");
        float num1 = scanner.nextFloat();

        System.out.println("Entre Segundo numero: ");
        System.out.print("||");
        float num2 = scanner.nextFloat();

        float residuo = num1 % num2;

        System.out.println("El residuo de la division de " + num1 + " entre " + num2 + " es: " + residuo);

        scanner.close();
    }
}
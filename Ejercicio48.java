import java.util.Scanner;
public class Ejercicio48 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos numeros para hacer operaciones: ");
        System.out.println("");

        System.out.println("");
        System.out.println("- Primer número: ");
        System.out.print("||");
        double num1 = scanner.nextDouble();

        System.out.println("");
        System.out.print("Ingresa el segundo número: ");
        System.out.print("||");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        double resto = num1 % num2;

        System.out.println("- Suma: " + suma);
        System.out.println("- Resta: " + resta);
        System.out.println("- Multiplicación: " + multiplicacion);
        System.out.println("- División: " + division);
        System.out.println("- Resto de la división: " + resto);

        scanner.close();
    }
}
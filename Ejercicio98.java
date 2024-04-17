import java.util.Scanner;

public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese dos valores ///");
        System.out.println("");

        System.out.println("- Primer valor: ");
        System.out.print("||");
        float valor1 = scanner.nextFloat();

        System.out.println("");
        System.out.println("- Segundo valor: ");
        System.out.print("||");
        float valor2 = scanner.nextFloat();

        float suma = valor1 + valor2;
        float resta = valor1 - valor2;

        if (resta != 0 && suma % resta == 0) {
            System.out.println("");
            System.out.println("La division de la suma entre la resta es exacta.");
        } else {
            System.out.println("");
            System.out.println("La division de la suma entre la resta no es exacta.");
        }

        scanner.close();
    }
}

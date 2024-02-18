import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 3 numeros para calcular su media aritmetica");
        System.out.println("");

        System.out.println("numero 1: ");
        System.out.print("||");
        float num1 = scanner.nextFloat();

        System.out.println("numero 2: ");
        System.out.print("||");
        float num2 = scanner.nextFloat();

        System.out.println("numero 3: ");
        System.out.print("||");
        float num3 = scanner.nextFloat();

        float media = (num1 + num2 + num3) / 3;

        System.out.println("La media aritmetica de los 3 numeros es: "+ media);

        scanner.close();
    }
}

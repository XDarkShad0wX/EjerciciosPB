import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal");
        System.out.print("||");
        float num = scanner.nextFloat();

        DecimalFormat formatoD = new DecimalFormat("#.###");
        int Entero = (int) num;
        double parteDecimal = num - Entero;

        System.out.println("La parte entera es: " + Entero);
        System.out.println("La parte decimal es: " + formatoD.format(parteDecimal));

        scanner.close();
    }
}

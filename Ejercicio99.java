import java.util.Scanner;

public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        System.out.print("||");
        int año = scanner.nextInt();

        boolean Bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

        if (Bisiesto) {
            System.out.println("");
            System.out.println(año + "- es un año bisiesto.");
        } else {
            System.out.println("");
            System.out.println(año + "- no es un año bisiesto.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

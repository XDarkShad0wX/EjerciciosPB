import java.util.Scanner;

public class Ejercicio128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un año: ");
        System.out.print("||");
        int año = scanner.nextInt();

        boolean esBisiesto = false;
        if (año % 4 == 0) {
            if (año % 100 != 0 || año % 400 == 0) {
                esBisiesto = true;
            }
        }

        if (esBisiesto) {
            System.out.println("");
            System.out.println(año + " es año bisiesto");
        } else {
            System.out.println("");
            System.out.println(año + " no es año bisiesto");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingresa el primer numero (A): ");
        System.out.print("||");
        double numeroA = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingresa el segundo numero (B): ");
        System.out.print("||");
        double numeroB = scanner.nextDouble();

        double suma = numeroA + numeroB;
        double resta = numeroA - numeroB;
        double multiplicacion = numeroA * numeroB;
        
        double division = 0;
        double residuo = 0;
        if (numeroB != 0) {
            division = numeroA / numeroB;
            residuo = numeroA % numeroB;
        }

        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (numeroB != 0) {
            System.out.println("División: " + division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("");
            System.out.println("///// No se puede realizar la division porque el segundo numero es cero /////");
        }

        scanner.close();
    }
}

import java.util.Scanner;
public class Ejercicio137 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("/// (x = (-b +- √(b^2 - 4ac))/(2a))) ///");
        System.out.println("");

        System.out.println("Ingrese el valor de a: ");
        System.out.print("||");
        double a = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingrese el valor de b: ");
        System.out.print("||");
        double b = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingrese el valor de c: ");
        System.out.print("||");
        double c = scanner.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante >= 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

            System.out.println("");
            System.out.println("Las raíces son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("");
            System.out.println("/// El discriminante es negativo (las raices son numeros complejos) ///");
        }

        scanner.close();
    }
}

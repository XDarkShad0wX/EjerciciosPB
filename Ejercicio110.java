import java.util.Scanner;

public class Ejercicio110{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una temperatura del dia: ");
        System.out.print("||");
        double temperatura = scanner.nextDouble();

        if (temperatura >= 0 && temperatura <= 10) {
            System.out.println("Hace Mucho Frio");
        } else if (temperatura >= 11 && temperatura <= 18) {
            System.out.println("Hace Frio");
        } else if (temperatura >= 19 && temperatura <= 25) {
            System.out.println("El clima esta Templado");
        } else if (temperatura >= 26 && temperatura <= 40) {
            System.out.println("Hace Calor");
        }

        scanner.close();
    }
}

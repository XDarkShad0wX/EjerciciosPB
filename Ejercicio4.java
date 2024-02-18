import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        System.out.print("||");

        float radio = scanner.nextFloat();
        float area = (float) (Math.PI * Math.pow(radio, 2));
        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}

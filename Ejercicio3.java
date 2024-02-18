import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del circulo: ");
        System.out.print("||");

        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto");
        System.out.print("||");
        double monto = scanner.nextDouble();

        double descuento;

        if (monto > 10000) {
            descuento = monto * 0.20;
        } else {
            descuento = monto * 0.10;
        }

        System.out.println("");
        System.out.println("El descuento aplicado es: $" + descuento);

        scanner.close();
    }
}

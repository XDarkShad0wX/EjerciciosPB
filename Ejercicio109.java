import java.util.Scanner;

public class Ejercicio109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la venta: ");
        System.out.print("||");
        float montoVenta = scanner.nextFloat();

        if (montoVenta > 1000) {
            float descuento = (float) (montoVenta * 0.10);
            float montoNeto = montoVenta - descuento;

            System.out.println("");
            System.out.println("El monto neto de la venta con descuento es: " + montoNeto);

        } else {
            System.out.println("");
            System.out.println("El monto neto de la venta sin descuento es: " + montoVenta);
        }

        scanner.close();
    }
}

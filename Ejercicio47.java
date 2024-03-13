import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese la cantidad comprada: ");
        System.out.print("||");
        int cantidad = scanner.nextInt();

        System.out.println("");
        System.out.println("Ingrese el precio de la compra: ");
        System.out.print("||");
        float precio = scanner.nextFloat();

        System.out.println("");
        System.out.println("Ingrese el precio pagado: ");
        System.out.print("||");
        float Pago = scanner.nextFloat();

        float descuento = precio - Pago;

        double porcentaje = (descuento / precio) * 100;

        System.out.println("- El descuento es de: " + porcentaje + "%");
        System.out.println("- El descuento por unidad es de: " + descuento / cantidad);

        scanner.close();
    }
}

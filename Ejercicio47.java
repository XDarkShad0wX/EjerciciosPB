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
        float precioCompra = scanner.nextFloat();

        System.out.println("Ingrese el precio pagado: ");
        System.out.print("||");
        float precioPagado = scanner.nextFloat();

        float descuento = precioCompra - precioPagado;

        double porcentajeDescuento = (descuento / precioCompra) * 100;

        System.out.println("- El descuento es de: " + porcentajeDescuento + "%");
        System.out.println("- El descuento por unidad es de: " + descuento / cantidad);

        scanner.close();
    }
}

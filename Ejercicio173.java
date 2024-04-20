import java.util.Scanner;

public class Ejercicio173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadTotalProductos = 0;
        double totalFactura = 0;

        System.out.println("");
        System.out.println("//// Ingrese las cantidades y precios de los productos (0 en la cantidad para terminar) ////");
        
        while (true) {
            System.out.println("");
            System.out.print("- Cantidad vendida: ");
            int cantidad = scanner.nextInt();

            if (cantidad == 0) {
                break;
            }

            System.out.println("");
            System.out.println("- Precio del producto: ");
            System.out.print("||");
            double precio = scanner.nextDouble();

            double totalProducto = cantidad * precio;
            cantidadTotalProductos += cantidad;
            totalFactura += totalProducto;
        }

        System.out.println("");
        System.out.println("\nTotal a pagar: $" + totalFactura);
        System.out.println("Cantidad total de productos: " + cantidadTotalProductos);

        scanner.close();
    }
}

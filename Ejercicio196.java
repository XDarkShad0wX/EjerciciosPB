import java.util.Random;

public class Ejercicio196 {
    public static void main(String[] args) {
        double[][] ingresos = new double[18][10];

        Random random = new Random();
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
            for (int producto = 0; producto < ingresos[0].length; producto++) {
                ingresos[vendedor][producto] = 1000 + random.nextDouble() * 4000;
            }
        }

        System.out.println("");
        System.out.println("Ingresos totales de cada vendedor:");

        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
            double totalVendedor = 0;

            for (int producto = 0; producto < ingresos[0].length; producto++) {
                totalVendedor += ingresos[vendedor][producto];
            }
            System.out.println("");
            System.out.println("- Vendedor " + (vendedor + 1) + ": $" + totalVendedor);
        }

        System.out.println("");
        System.out.println("\nPromedio por cada producto:");
        for (int producto = 0; producto < ingresos[0].length; producto++) {

            double totalProducto = 0;

            for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {
                totalProducto += ingresos[vendedor][producto];
            }

            double promedioProducto = totalProducto / ingresos.length;
            System.out.println("");
            System.out.println("- Producto " + (producto + 1) + ": $" + promedioProducto);
        }

        System.out.println("");
        System.out.println("\nPromedio por vendedor:");
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {

            double totalVendedor = 0;

            for (int producto = 0; producto < ingresos[0].length; producto++) {
                totalVendedor += ingresos[vendedor][producto];
            }

            double promedioVendedor = totalVendedor / ingresos[0].length;

            System.out.println("");
            System.out.println("- Vendedor " + (vendedor + 1) + ": $" + promedioVendedor);
        }

        double ingresosTotales = 0;
        for (int vendedor = 0; vendedor < ingresos.length; vendedor++) {

            for (int producto = 0; producto < ingresos[0].length; producto++) {
                ingresosTotales += ingresos[vendedor][producto];
            }
        }

        System.out.println("");
        System.out.println("\n - Ingresos totales de la empresa: $" + ingresosTotales);
    }
}

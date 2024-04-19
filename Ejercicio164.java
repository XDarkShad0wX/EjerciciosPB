import java.util.Scanner;

public class Ejercicio164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalBoletosVendidos = 0;
        double ventaBruta = 0;
        int boletosAdulto = 0;
        int boletosNino = 0;
        int boletosPromocion = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("----------------------------------");
            System.out.println("//////////// Venta " + i + " ////////////");
            System.out.println("- Tipo de boleto vendido (1/2/3): ");
            System.out.println("1. Adulto ($60)");
            System.out.println("2. Niño ($30)");
            System.out.println("3. Promoción ($20)");
            System.out.println("----------------------------------");
            System.out.print("||");
            int tipoBoleto = scanner.nextInt();

            int cantidad;
            switch (tipoBoleto) {
                case 1:
                    System.out.println("");
                    System.out.println("Cantidad de boletos vendidos para Adulto: ");
                    System.out.print("||");
                    cantidad = scanner.nextInt();

                    boletosAdulto += cantidad;
                    ventaBruta += cantidad * 60;
                    totalBoletosVendidos += cantidad;
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Cantidad de boletos vendidos para Niño: ");
                    System.out.print("||");
                    cantidad = scanner.nextInt();

                    boletosNino += cantidad;
                    ventaBruta += cantidad * 30;
                    totalBoletosVendidos += cantidad;
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Cantidad de boletos vendidos para Promocion: ");
                    System.out.print("||");
                    cantidad = scanner.nextInt();

                    boletosPromocion += cantidad;
                    ventaBruta += cantidad * 20;
                    totalBoletosVendidos += cantidad;
                    break;
                default:
                    System.out.println("///// Bruto, esa opcion no existe /////");
                    i--;
            }
        }

        System.out.println("");
        System.out.println("-----------------------------------------------------");
        System.out.println("\nResumen de ventas:");
        System.out.println("Total de boletos vendidos: " + totalBoletosVendidos);
        System.out.println("Venta bruta: $" + ventaBruta);
        System.out.println("Boletos vendidos para Adulto: " + boletosAdulto);
        System.out.println("Boletos vendidos para Niño: " + boletosNino);
        System.out.println("Boletos vendidos para Promoción: " + boletosPromocion);

        scanner.close();
    }
}

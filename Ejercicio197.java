import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio197 {
    public static void main(String[] args) {
        String archivo = "estado_cuenta.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String nombre = br.readLine();
            String numeroCuenta = br.readLine();

            System.out.println("");
            System.out.println("Estado de Cuenta");
            System.out.println("Nombre: " + nombre);
            System.out.println("Número de Cuenta: " + numeroCuenta);
            System.out.println("\nMovimientos:");

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosMovimiento = linea.split(",");
                String tipoMovimiento = datosMovimiento[0];
                double monto = Double.parseDouble(datosMovimiento[1]);
                double saldo = Double.parseDouble(datosMovimiento[2]);

                System.out.println("");
                System.out.println("Tipo de Movimiento: " + tipoMovimiento);
                System.out.println("Monto: $" + monto);
                System.out.println("Saldo: $" + saldo);
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("//// No se pudo leer el archivo: " + e.getMessage() + "////");
        }
    }
}

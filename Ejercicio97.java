import java.util.Scanner;

public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el consumo de la Termoelectrica Manta en Kw: ");
        System.out.print("||");
        double consumo = scanner.nextDouble();

        double porcentaje = (consumo / 10000) * 100;

        if (porcentaje >= 80 && porcentaje <= 100) {
            System.out.println("");
            System.out.println("CONSUMO MEDIO");
        } else if (porcentaje > 100) {
            System.out.println("");
            System.out.println("ALTO CONSUMO DE ENERGÍA");
        }

        scanner.close();
    }
}

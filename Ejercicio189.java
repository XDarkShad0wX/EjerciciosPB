import java.util.Scanner;

public class Ejercicio189 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("///// Ingrese las coordenadas de inicio del caballo (x y) /////");
        System.out.println("");

        System.out.println("- Valor de X: ");
        System.out.print("||");
        int xInicio = scanner.nextInt();

        System.out.println("");
        System.out.println("- Valor de Y: ");
        System.out.print("||");
        int yInicio = scanner.nextInt();

        System.out.println("");
        System.out.println("///// Ingrese las coordenadas de destino (x y) /////");
        System.out.println("");

        System.out.println("- Valor de X: ");
        System.out.print("||");
        int xDestino = scanner.nextInt();

        System.out.println("");
        System.out.println("- Valor de Y: ");
        System.out.print("||");
        int yDestino = scanner.nextInt();

        int deltaX = Math.abs(xDestino - xInicio);
        int deltaY = Math.abs(yDestino - yInicio);
        boolean movimientoValido = (deltaX == 1 && deltaY == 2) || (deltaX == 2 && deltaY == 1);

        if (movimientoValido) {
            System.out.println("");
            System.out.println("-- El movimiento del caballo es valido --");
        } else {
            System.out.println("///// El movimiento del caballo no es valido /////");
        }

        scanner.close();
    }
}


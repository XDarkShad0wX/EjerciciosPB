import java.util.Scanner;

public class Ejercicio187 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("///// Ingrese la posición inicial de la reina (fila y columna) /////");
        System.out.println("");

        System.out.println("- Fila:");
        System.out.print("||");
        int filaActual = scanner.nextInt();

        System.out.println("");
        System.out.println("- Columna");
        System.out.print("||");
        int columnaActual = scanner.nextInt();

        System.out.println("");
        System.out.println("///// Ingrese la posición a la que desea mover la reina (fila y columna) /////");
        System.out.println("");

        System.out.println("- Fila:");
        System.out.print("||");
        int filaNueva = scanner.nextInt();

        System.out.println("");
        System.out.println("- Columna");
        System.out.print("||");
        int columnaNueva = scanner.nextInt();

        boolean movimientoValido = false;
        if (filaActual == filaNueva || columnaActual == columnaNueva) {
            movimientoValido = true;
        }
        if (Math.abs(filaActual - filaNueva) == Math.abs(columnaActual - columnaNueva)) {
            movimientoValido = true;
        }

        if (movimientoValido) {
            System.out.println("");
            System.out.println("-- El movimiento es valido --");
        } else {
            System.out.println("");
            System.out.println("///// El movimiento no es valido /////");
        }

        scanner.close();
    }
}

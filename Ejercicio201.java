import java.util.Scanner;

public class Ejercicio201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("///// Ingrese las tres calificaciones parciales /////");
        System.out.println("");

        System.out.println("");
        System.out.println("- Primera nota: ");
        System.out.print("||");
        double calificacionParcial1 = (scanner.nextDouble() / 10.0) * 4.0 + 1.0;

        System.out.println("");
        System.out.println("- Segunda nota: ");
        System.out.print("||");
        double calificacionParcial2 = (scanner.nextDouble() / 10.0) * 4.0 + 1.0;

        System.out.println("");
        System.out.println("- Tercera nota: ");
        System.out.print("||");
        double calificacionParcial3 = (scanner.nextDouble() / 10.0) * 4.0 + 1.0;

        System.out.println("");
        System.out.println("Ingrese la calificación del examen final:");
        System.out.print("||");
        double calificacionExamenFinal = (scanner.nextDouble() / 10.0) * 4.0 + 1.0;

        System.out.println("");
        System.out.println("Ingrese la calificación del trabajo final:");
        System.out.print("||");
        double calificacionTrabajoFinal = (scanner.nextDouble() / 10.0) * 4.0 + 1.0;

        double promedioParciales = (calificacionParcial1 + calificacionParcial2 + calificacionParcial3) / 3.0;
        double calificacionFinal = promedioParciales * 0.55 + calificacionExamenFinal * 0.30 + calificacionTrabajoFinal * 0.15;

        System.out.println("");
        System.out.println("La calificación final en la materia de Algoritmos es: " + calificacionFinal);

        scanner.close();
    }
}

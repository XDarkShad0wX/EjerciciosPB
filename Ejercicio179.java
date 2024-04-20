import java.util.Scanner;

public class Ejercicio179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Ingrese las calificaciones del alumno ////");
        System.out.println("");

        System.out.println("- Matematicas: ");
        System.out.print("||");
        double matematicas = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingles: ");
        System.out.print("||");
        double ingles = scanner.nextDouble();

        System.out.println("");
        System.out.println("Español: ");
        System.out.print("||");
        double espanol = scanner.nextDouble();

        double promedio = (matematicas + ingles + espanol) / 3;

        int materiasAprobadas = 0;
        int materiasReprobadas = 0;
        if (matematicas >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }
        if (ingles >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }
        if (espanol >= 6) {
            materiasAprobadas++;
        } else {
            materiasReprobadas++;
        }

        String materiaMenorCalificacion = "";
        double calificacionMenor = Double.MAX_VALUE;
        if (matematicas < calificacionMenor) {
            calificacionMenor = matematicas;
            materiaMenorCalificacion = "Matemáticas";
        }
        if (ingles < calificacionMenor) {
            calificacionMenor = ingles;
            materiaMenorCalificacion = "Inglés";
        }
        if (espanol < calificacionMenor) {
            calificacionMenor = espanol;
            materiaMenorCalificacion = "Español";
        }

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("\nPromedio: " + promedio);
        System.out.println("Total de materias aprobadas: " + materiasAprobadas);
        System.out.println("Total de materias reprobadas: " + materiasReprobadas);
        System.out.println("Materia con menor calificación: " + materiaMenorCalificacion + " (" + calificacionMenor + ")");

        scanner.close();
    }
}

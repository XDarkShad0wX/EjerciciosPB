import  java.util.Scanner;
public class Ejercicio147 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aprobaronTodos = 0;
        int aprobaronAlMenosUno = 0;
        int aprobaronSoloUltimo = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("");
            System.out.println("Ingrese las calificaciones del alumno " + i + ":");
            System.out.println("");

            System.out.println("- nota 1:");
            System.out.print("||");
            int examen1 = scanner.nextInt();

            System.out.println("");
            System.out.println("- nota 2:");
            System.out.print("||");
            int examen2 = scanner.nextInt();

            System.out.println("");
            System.out.println("- nota 3:");
            System.out.print("||");
            int examen3 = scanner.nextInt();

            if (examen1 >= 60 && examen2 >= 60 && examen3 >= 60) {
                aprobaronTodos++;
            }
            if (examen1 >= 60 || examen2 >= 60 || examen3 >= 60) {
                aprobaronAlMenosUno++;
            }
            if (examen3 >= 60 && examen1 < 60 && examen2 < 60) {
                aprobaronSoloUltimo++;
            }
        }

        System.out.println("");
        System.out.println("a) Alumnos que aprobaron todos los examenes: " + aprobaronTodos);
        System.out.println("b) Alumnos que aprobaron al menos un examen: " + aprobaronAlMenosUno);
        System.out.println("c) Alumnos que aprobaron unicamente el ultimo examen: " + aprobaronSoloUltimo);

        scanner.close();
    }
}

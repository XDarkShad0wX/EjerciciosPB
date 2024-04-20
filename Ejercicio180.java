import java.util.Scanner;

public class Ejercicio180 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de personas que asistieron a la fiesta: ");
        System.out.print("||");
        int numeroPersonas = scanner.nextInt();

        int totalPersonas = 0;
        int totalHombres = 0;
        int totalMujeres = 0;
        int sumaEdadesHombres = 0;
        int sumaEdadesMujeres = 0;
        int edadMasJoven = Integer.MAX_VALUE;

        for (int i = 1; i <= numeroPersonas; i++) {
            System.out.println("");
            System.out.println("- \nPersona " + i + ":");
            System.out.println("");
            System.out.println("Edad: ");
            System.out.print("||");
            int edad = scanner.nextInt();

            System.out.println("");
            System.out.println("Sexo (M/F): ");
            System.out.print("||");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (edad < 18) {
                System.out.println("");
                System.out.println("//// Edad no valida (Menjor de edad) ////");
                continue;
            }

            totalPersonas++;
            if (sexo == 'M') {
                totalHombres++;
                sumaEdadesHombres += edad;
            } else if (sexo == 'F') {
                totalMujeres++;
                sumaEdadesMujeres += edad;
            }
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
            }
        }

        double promedioEdadHombres = totalHombres > 0 ? (double) sumaEdadesHombres / totalHombres : 0;
        double promedioEdadMujeres = totalMujeres > 0 ? (double) sumaEdadesMujeres / totalMujeres : 0;

        System.out.println("");
        System.out.println("------------------------------------------------");
        System.out.println("\nEstadísticas de la fiesta:");
        System.out.println("Total de personas: " + totalPersonas);
        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Promedio de edades de hombres: " + promedioEdadHombres);
        System.out.println("Promedio de edades de mujeres: " + promedioEdadMujeres);
        System.out.println("Edad de la persona más joven que asistió: " + edadMasJoven);

        scanner.close();
    }
}

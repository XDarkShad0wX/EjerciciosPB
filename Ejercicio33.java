import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorHom = 0;
        int contadorMuj = 0;
        int sumaSalarios = 0;
        int salarioM700 = 0;
        int contadorEmpl = 1;

        System.out.println("");
        System.out.println("Ingrese el número de empleados: ");
        System.out.print("||");

        while (!scanner.hasNextInt()) {
            System.out.println("");
            System.out.println("- Ingrese un número entero -");
            System.out.print("||");

            scanner.next();
        }

        int numeroE = scanner.nextInt();

        while (contadorEmpl <= numeroE) {

            System.out.println("");
            System.out.println("Ingrese el genero del empleado #" + contadorEmpl + " (Hombre - Mujer)");
            System.out.print("||");

            String genero = scanner.next();

            while (!genero.toString().trim().equals("Hombre") && !genero.toString().trim().equals("Mujer")) {
                System.out.println("");
                System.out.println("/// Solo (Hombre - Mujer), Ingrese de nuevo: ///");
                System.out.print("||");
                genero = scanner.next();
            }
            if (genero.trim().equalsIgnoreCase("Hombre")) {
                contadorHom++;
            } else if (genero.trim().equalsIgnoreCase("Mujer")) {
                contadorMuj++;
            }

            System.out.println("");
            System.out.println("Ingrese el Salario del empleado");
            System.out.print("||");

            while (!scanner.hasNextInt()) {
                System.out.println("");
                System.out.println("- Ingrese un numero Entero -");
                System.out.print("||");

                scanner.next();
            }

            int salarioE = scanner.nextInt();

            if (salarioE >= 800) {
                salarioM700++;
            }

            sumaSalarios += salarioE;
            contadorEmpl++;
        }
        double promedioSalarios = (double) sumaSalarios / numeroE;
        double porcentajeMujeres = ((double) contadorMuj / numeroE) * 100;
        double porcentajeHombres = ((double) contadorHom / numeroE) * 100;

        System.out.println("");
        System.out.println(".............................................................");
        System.out.println("- Cantidad de personas que ganan más de 700: " + salarioM700);
        System.out.println("- Promedio de salarios: " + promedioSalarios);
        System.out.println("- Porcentaje de Mujeres: " + Math.round(porcentajeMujeres * 100.0) / 100.0 + "%");
        System.out.println("- Porcentaje de Hombres: " + Math.round(porcentajeHombres * 100.0) / 100.0 + "%");

        scanner.close();
    }
}

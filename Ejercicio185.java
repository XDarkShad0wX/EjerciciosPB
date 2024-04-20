import java.util.Scanner;

public class Ejercicio185 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("//// Ingrese los siguientes datos para generar la CURP ////");
        System.out.println("");

        System.out.println("- Primer apellido: ");
        System.out.print("||");
        String primerApellido = scanner.nextLine().toUpperCase();

        System.out.println("");
        System.out.println("- Segundo apellido: ");
        System.out.print("||");
        String segundoApellido = scanner.nextLine().toUpperCase();

        System.out.println("");
        System.out.println("- Nombre(s): ");
        System.out.print("||");
        String nombre = scanner.nextLine().toUpperCase();

        System.out.println("");
        System.out.println("- Fecha de nacimiento (AAAA-MM-DD): ");
        System.out.print("||");
        String fechaNacimiento = scanner.nextLine();

        System.out.println("");
        System.out.println("- Sexo (F/M): ");
        System.out.print("||");
        char sexo = scanner.nextLine().toUpperCase().charAt(0);

        System.out.println("");
        System.out.println("Entidad de nacimiento (2 letras): ");
        System.out.print("||");
        String entidadNacimiento = scanner.nextLine().toUpperCase();

        char primeraLetraSegundoApellido = primerApellido.charAt(0);
        char primeraLetraNombre = nombre.charAt(0);

        String fechaCurp = fechaNacimiento.substring(2, 4) +
            fechaNacimiento.substring(5, 7) + fechaNacimiento.substring(8, 10);

        char letraSexo = sexo;
        String entidadCurp = entidadNacimiento;
        char primeraConsonanteInternaPrimerApellido = ' ';
        char primeraConsonanteInternaSegundoApellido = ' ';
        char primeraConsonanteInternaNombre = ' ';

        for (int i = 1; i < primerApellido.length(); i++) {
            char letra = primerApellido.charAt(i);
            if (!(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')) {
                primeraConsonanteInternaPrimerApellido = letra;
                break;
            }
        }
        for (int i = 1; i < segundoApellido.length(); i++) {
            char letra = segundoApellido.charAt(i);
            if (!(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')) {
                primeraConsonanteInternaSegundoApellido = letra;
                break;
            }
        }
        for (int i = 1; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            if (!(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')) {
                primeraConsonanteInternaNombre = letra;
                break;
            }
        }
        char digitoVerificador;
        int año = Integer.parseInt(fechaNacimiento.substring(2, 4));
        if (año >= 0 && año <= 99) {
            digitoVerificador = (char) ('0' + año);
        } else {
            digitoVerificador = (char) ('A' + año - 100);
        }

        String curp = "" + primeraLetraSegundoApellido + primeraLetraNombre + fechaCurp + letraSexo + entidadCurp +
                primeraConsonanteInternaPrimerApellido + primeraConsonanteInternaSegundoApellido +
                primeraConsonanteInternaNombre + digitoVerificador + "XXX";

        System.out.println("");
        System.out.println("\nLa CURP generada es: " + curp);

        scanner.close();
    }
}

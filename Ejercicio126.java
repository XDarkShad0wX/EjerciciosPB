import java.util.Scanner;

public class Ejercicio126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("//// Ingrese la fecha en formato AAAA MM DD (Ej: 2012 01 23) ////");
        System.out.println("");

        System.out.println("- Año: ");
        System.out.print("||");
        int year = scanner.nextInt();

        System.out.println("- Mes");
        System.out.print("||");
        int month = scanner.nextInt();

        System.out.println("- dia");
        System.out.print("||");
        int day = scanner.nextInt();

        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String nombreMes = meses[month];

        System.out.println("");
        System.out.println(day + " " + nombreMes + " de " + year);

        scanner.close();
    }
}

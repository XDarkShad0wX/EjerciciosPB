import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese su fecha de nacimiento (AAAA-MM-DD):");
        System.out.print("||");
        String fechaNacimientoStr = scanner.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        System.out.println("");
        System.out.println("Su edad es de: " + edad + " años.");

        scanner.close();
    }
}

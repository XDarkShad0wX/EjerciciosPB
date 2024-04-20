import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio176 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaSiguiente = fechaActual.plusDays(1);

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaActualStr = fechaActual.format(formatoFecha);
        String fechaSiguienteStr = fechaSiguiente.format(formatoFecha);

        System.out.println("");
        System.out.println("- La fecha del día siguiente a " + fechaActualStr + " es: " + fechaSiguienteStr);
    }
}

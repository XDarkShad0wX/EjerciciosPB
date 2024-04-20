import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio175 {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();

        LocalDate fechaAnterior = fechaActual.minusDays(1);

        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaActualStr = fechaActual.format(formatoFecha);
        String fechaAnteriorStr = fechaAnterior.format(formatoFecha);

        System.out.println("");
        System.out.println("- La fecha del dia anterior a " + fechaActualStr + " es: " + fechaAnteriorStr);
    }
}

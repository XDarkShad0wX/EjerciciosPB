import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SimpleDateFormat formatoFecha = new SimpleDateFormat("MM-yyyy");

        System.out.println("");
        System.out.println("Ingresa el periodo en formato MM-yyyy (Ej. 10-2011): ");
        System.out.print("||");
        String periodoStr = scanner.next();

        try {
            Date periodo = formatoFecha.parse(periodoStr);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(periodo);

            System.out.println("");
            System.out.println("Los 12 periodos anteriores a " + periodoStr + " son:");
            for (int i = 0; i < 12; i++) {

                calendar.add(Calendar.MONTH, -1);

                String nuevoPeriodo = formatoFecha.format(calendar.getTime());
                System.out.println(nuevoPeriodo);
            }
        } catch (ParseException e) {
            System.out.println("");
            System.out.println("//// El formato de fecha no es valido ////");
        }

        scanner.close();
    }
}

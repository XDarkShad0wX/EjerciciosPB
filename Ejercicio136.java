import java.time.LocalTime;

public class Ejercicio136 {
    public static void main(String[] args) {

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            LocalTime tiempoActual = LocalTime.now();

            int horas = tiempoActual.getHour();
            int minutos = tiempoActual.getMinute();
            int segundos = tiempoActual.getSecond();

            String periodo = "AM";
            if (horas >= 12) {
                periodo = "PM";
                if (horas > 12) {
                    horas -= 12;
                }
            }

            System.out.printf("%02d:%02d:%02d %s\n", horas, minutos, segundos, periodo);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

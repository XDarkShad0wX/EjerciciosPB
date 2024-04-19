import java.util.Scanner;

public class Ejercicio160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un tiempo en segundos:");
        System.out.print("");
        int segundos = scanner.nextInt();

        int dias = segundos / (24 * 3600);
        int horas = segundos / 3600;
        int minutos = segundos / 60;


        System.out.println("");
        System.out.println("- Dias: " + dias);
        System.out.println("- Horas: " + horas);
        System.out.println("- Minutos: " + minutos);
        System.out.println("- Segundos: " + segundos);

        scanner.close();
    }
}

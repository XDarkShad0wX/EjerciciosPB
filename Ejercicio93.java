import java.util.Scanner;

public class Ejercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un tiempo en minutos: ");
        System.out.print("||");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRes = minutos % 60;
        int segundos = minutosRes * 60;

        System.out.println("");
        System.out.println("El tiempo ingresado es: " + horas + " horas, " + minutosRes + " minutos y " + segundos + " segundos.");

        scanner.close();
    }
}

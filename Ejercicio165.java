import java.util.Scanner;

public class Ejercicio165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de horas: ");
        System.out.print("||");
        int horas = scanner.nextInt();

        System.out.println("");
        System.out.println("Ingresa la cantidad de minutos: ");
        System.out.print("||");
        int minutos = scanner.nextInt();

        System.out.println("");
        System.out.println("Ingresa la cantidad de segundos: ");
        System.out.print("||");
        int segundos = scanner.nextInt();

        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.println("");
        System.out.println("\nEl total de segundos es: " + totalSegundos);

        scanner.close();
    }
}

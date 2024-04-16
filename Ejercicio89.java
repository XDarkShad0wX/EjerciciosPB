import java.util.Scanner;

public class Ejercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una distancia en metros: ");
        System.out.print("||");
        double metros = scanner.nextDouble();

        double kilometros = metros / 1000;

        System.out.println("La distancia de " + metros + "Mt es equivalente a " + kilometros + " Km.");

        scanner.close();
    }
}

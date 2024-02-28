import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia en kilometros: ");
        System.out.print("||");
        double Km = scanner.nextDouble();

        double Metros = Km * 1000;

        System.out.println("La distancia de " + Km + "Km en metros es: " + Metros + "Mt");
        
        scanner.close();
    }
}
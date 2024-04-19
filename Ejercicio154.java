import java.util.Scanner;

public class Ejercicio154 {
    public static void main(String[] args) {

        String saludo = "Hola que tal";

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Cual es su nombre?: ");
        System.out.print("||");
        String nombre = scanner.nextLine();

        saludo += " " + nombre;

        System.out.println("");
        System.out.println(saludo);

        scanner.close();
    }
}

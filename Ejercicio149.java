import java.util.Random;
import java.util.Scanner;

public class Ejercicio149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1;
        int intentos = 0;
        int numeroElegido;

        System.out.println("");
        System.out.println("//// Adivina un numero entre 1 y 100 ////");

        do {
            System.out.println("");
            System.out.print("- ¿Cual es tu numero? -");
            numeroElegido = scanner.nextInt();
            intentos++;

            if (numeroElegido < numeroAleatorio) {
                System.out.println("");
                System.out.println("[?] El numero que elegiste es menor.");
            } else if (numeroElegido > numeroAleatorio) {
                System.out.println("");
                System.out.println("[?] El numero que elegiste es mayor.");
            }
        } while (numeroElegido != numeroAleatorio);

        System.out.println("");
        System.out.println("- Has adivinado el numero " + numeroAleatorio + " en " + intentos + " intentos.");

        scanner.close();
    }
}

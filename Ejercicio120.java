import java.util.Scanner;

public class Ejercicio120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Hola usuario!");

        while (true) {
            System.out.println("");
            System.out.println("¿Desea que siga imprimiendo el saludo? [S/N]: ");
            System.out.print("||");
            char respuesta = scanner.next().charAt(0);

            if (respuesta == 'S' || respuesta == 's') {
                System.out.println("");
                System.out.println("Hola usuario!");
            } else if (respuesta == 'N' || respuesta == 'n') {
                System.out.println("");
                System.out.println("Fin del programa.");

                break;
            } else {
                System.out.println("");
                System.out.println("//// Solo puede ingresar [S o N] ////");
            }
        }

        scanner.close();
    }
}

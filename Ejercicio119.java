import java.util.Scanner;

public class Ejercicio119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correcta = "passwd";
        int limite = 3;
        int intentos = 0;

        while (intentos < limite) {
            System.out.println("");
            System.out.println("Ingrese una contraseña: ");
            System.out.print("||");
            String contraseña = scanner.nextLine();

            if (contraseña.equals(correcta)) {
                System.out.println("");
                System.out.println("Contraseña correcta");
                break;
            } else {
                System.out.println("");
                System.out.println("Contraseña incorrecta");
                intentos++;
            }
        }

        if (intentos >= limite) {
            System.out.println("");
            System.out.println("/// maximo limite de intentos ///");
        }

        scanner.close();
    }
}

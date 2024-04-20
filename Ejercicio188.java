import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio188 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean correoValido = false;
        while (!correoValido) {
            System.out.println("");
            System.out.println("Ingrese la dirección de correo electrónico:");
            System.out.print("||");
            String correoElectronico = scanner.nextLine();

            if (esCorreoValido(correoElectronico)) {
                System.out.println("");
                System.out.println("-- La direccion de correo electrónico es valida --");
                correoValido = true;
            } else {
                System.out.println("");
                System.out.println("///// La dirección de correo electronico no es valida /////");
            }
        }

        scanner.close();
    }

    public static boolean esCorreoValido(String correoElectronico) {
        String patron = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(correoElectronico);

        return matcher.matches();
    }
}

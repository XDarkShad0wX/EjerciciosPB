import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor escriba un mensaje: ");
        String texto = scanner.nextLine();
        System.out.println("");
        System.out.println("El texto ingresado es: " + texto);
        scanner.close();
    }
}

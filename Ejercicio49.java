import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto");
        System.out.print("||");
        String texto = scanner.nextLine();

        char primeraLetra = texto.charAt(0);

        System.out.println("La primera letra es: " + primeraLetra);

        scanner.close();
    }
}

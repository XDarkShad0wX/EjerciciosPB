import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor en Grados Centígrados para convertir a Fahrenheit");
        System.out.print("||");
        float num = scanner.nextFloat();

        float convercion = (((num * 9) / 5) + 32);

        System.out.println(num + " Grados Centigrados es igual a " + convercion + " Fahrenheit");

        scanner.close();
    }
}

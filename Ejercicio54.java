import java.util.Scanner;
public class Ejercicio54 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una longitud en centimetros para comvertir en pulgadas: ");
        System.out.print("||");
        float longitud = scanner.nextFloat();

        float centimetros = 2.54f;

        float pulgadas = longitud / centimetros;

        System.out.println("");
        System.out.println("- " + longitud + " Centimetros es: " + pulgadas + " pulgadas");

        scanner.close();
    }
}
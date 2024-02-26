import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un valor en Pulgadas para convertir a Centimetros");
        System.out.print("||");
        float num = scanner.nextFloat();

        float pulgadas = (float) 2.54;
        float convercion = num * pulgadas;

        System.out.println(num + " pulgadas es igual a " + convercion + " centimetros");

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] arg) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la base del Triangulo: ");
        System.out.println("||");
        float baseT = scanner.nextFloat();
        System.out.println("Ingrede la altura del Triangulo: ");
        float alturaT = scanner.nextFloat();

        float area = (baseT * alturaT) / 2;

        System.out.println("El area del Triangulo es de: " + area);
        scanner.close();
    }
}

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la Base del triangulo: ");
        System.out.print("||");
        float baseT = scanner.nextFloat();

        System.out.println("Ingrese la Altura del triangulo: ");
        System.out.print("||");
        float alturaT = scanner.nextFloat();

        float area = (baseT * alturaT) / 2;

        System.out.println("El area del triangulo es: " + area);
    }
}

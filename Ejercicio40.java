import java.util.Scanner;

public class Ejercicio40 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de kilos de oro");
        System.out.print("||");
        float kilos = scanner.nextFloat();

        System.out.println("Ingrese el precio por onza en pesos");
        System.out.print("||");
        float PrecioPO = scanner.nextFloat();

        float gramos = kilos * 1000;
        float onzas = (float) (gramos / 28.3495);
        float totalPesos = onzas * PrecioPO;

        System.out.println("La cantidad de onzas de oro es: " + onzas);
        System.out.println("El equivalente en pesos es: " + totalPesos);
        scanner.close();
    }
}
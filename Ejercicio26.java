import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos para alcular el cuadrado de la hipotenusa de un triángulo rectángulo");
        System.out.println("");

        System.out.println("Valor del Cateto A: ");
        System.out.print("||");
        float CatA = scanner.nextFloat();

        System.out.println("Valor del Cateto B: ");
        System.out.print("||");
        float CatB = scanner.nextFloat();

        float longitudHi = (float) ((Math.pow(CatA, 2)) + (Math.pow(CatB, 2)));

        System.out.println("El cuadrado de la Hipotenusa del triangulo rectangulo es: " + longitudHi);

        scanner.close();
    }
}

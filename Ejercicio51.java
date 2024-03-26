import java.util.Scanner;

public class Ejercicio51 {
    public static void main(String[] arg) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese los datos para calcular el area y el perimetro de un rectangulo ///");
        System.out.println("");
        System.out.println("- base del rectangulo: ");
        System.out.print("||");
        float base = scanner.nextFloat();

        System.out.println("- Altura del rectangulo: ");
        System.out.print("||");
        float altura = scanner.nextFloat();

        float area = base * altura;
        float perimetro = (2 * base) + (altura * 2);

        System.out.println("");
        System.out.println("El area del rectangulo es de: " + area);
        System.out.println("El perimetro del rectangulo es de: " + perimetro);

        scanner.close();
    }
}
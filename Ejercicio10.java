import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] arg) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese las longitudes de los lados para calcular el area del triangulo ///");
        System.out.println("")
        ;
        System.out.println("Lado A: ");
        System.out.print("||");
        float ladoA = scanner.nextFloat();

        System.out.println("Lado B: ");
        System.out.print("||");
        float ladoB = scanner.nextFloat();

        System.out.println("Lado C: ");
        System.out.print("||");
        float ladoC = scanner.nextFloat();

        float semiPerimetro = (ladoA + ladoB + ladoC) / 2;
        
        float area = (float)Math.sqrt(semiPerimetro * (semiPerimetro - ladoA) * (semiPerimetro - ladoB) * (semiPerimetro - ladoC));


        System.out.println("El area del Triangulo es de: " + area);

        scanner.close();
    }
}
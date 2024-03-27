import java.util.Scanner;
public class Ejercicio62 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("-- Ingrese los valores de las temperaturas (6) en un periodo de cada 4 horas en 24 horas --");
        System.out.println("");

        System.out.println("Temperatura 1: ");
        System.out.print("||");
        float temp1 = scanner.nextFloat();

        System.out.println("");
        System.out.println("Temperatura 2: ");
        System.out.print("||");
        float temp2 = scanner.nextFloat();

        System.out.println("");
        System.out.println("Temperatura 3: ");
        System.out.print("||");
        float temp3 = scanner.nextFloat();

        System.out.println("");
        System.out.println("Temperatura 4: ");
        System.out.print("||");
        float temp4 = scanner.nextFloat();

        System.out.println("");
        System.out.println("Temperatura 5: ");
        System.out.print("||");
        float temp5 = scanner.nextFloat();

        System.out.println("");
        System.out.println("Temperatura 6: ");
        System.out.print("||");
        float temp6 = scanner.nextFloat();

        float media = (temp1 + temp2 + temp3 + temp4 + temp5 + temp6) / (6);

        System.out.println("");
        System.out.println("La media de la temperatura en el dia es de: " + media + "°");

        scanner.close();
    }
}

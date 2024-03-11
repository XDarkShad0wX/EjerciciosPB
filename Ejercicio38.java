import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        System.out.print("||");
        int años = scanner.nextInt();

        int añoF = 8;
        int totalGra = añoF * años;
        int manzanasTotal = totalGra / 4;

        System.out.println("- Ha consumido " + totalGra + "Kg de frutas en total");
        System.out.println("- Ha consumido " + manzanasTotal + " manzanas");


        scanner.close();
    }
}

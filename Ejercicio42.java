import java.util.Scanner;
public class Ejercicio42 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese los voltios necesarios");
            System.out.print("||");
            float voltios = scanner.nextFloat();

            float voltiosN = 0.05f;
            int totalN = (int) (voltios / voltiosN);
            float toneladasN = (float) (totalN * 0.006 / 1000);

            System.out.println("- Total de naranjas necesarias: " + totalN);
            System.out.println("- Cantidad en Toneladas: " + toneladasN);

            scanner.close();
    }
}
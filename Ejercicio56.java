import java.util.Scanner;
public class Ejercicio56 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un tiempo en segundo");
        System.out.print("||");
        float seg = scanner.nextFloat();

        float minutos = seg / 60;
        float horas = seg / 3600;

        System.out.println("");
        System.out.println("El tiempo " + seg + " Segundos equivale a: ");
        System.out.println("- Minutos: " + minutos);
        System.out.println("- Horas: " + horas);

        scanner.close();
    }
}

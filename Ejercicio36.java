import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las Horas estacionado");
        System.out.print("||");
        int horasEs = scanner.nextInt();

        System.out.println("Ingrese los Minutos estacionado");
        System.out.print("||");
        int minutos = scanner.nextInt();

        int tiempoEst = (horasEs * 60) + minutos;

        int horasT = (int) Math.ceil(tiempoEst / 60.0);

        float totalPagar = (float) (horasT * 15.00);

        System.out.println("El total a pagar es de: " + totalPagar);

        scanner.close();
    }
}

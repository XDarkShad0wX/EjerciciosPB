import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las Horas estacionado");
        System.out.print("||");
        int horasEs = scanner.nextInt();

        System.out.println("Ingrese los Minutos estacionado");
        System.out.print("||");
        int minutos = scanner.nextInt();

        int tiempoEst;
        int horasT;

        if(minutos >= 10) {
            tiempoEst = (horasEs * 60) + minutos;
            horasT = (int) Math.ceil(tiempoEst / 60.0);
        } else {
            tiempoEst = (horasEs * 60);
            horasT = (int) Math.ceil(tiempoEst / 60.0);
        }

        float totalPagar = (float) (horasT * 15.00);
        System.out.println("El total a pagar es de: " + totalPagar);

        scanner.close();
    }
}

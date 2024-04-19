import java.util.Scanner;

public class Ejercicio141 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        System.out.print("||");
        double numero = scanner.nextDouble();

        double estimacion = numero / 2;
        double epsilon = 0.0001;
        double raizCuadrada = 0;

        do {
            raizCuadrada = estimacion;
            estimacion = (estimacion + numero / estimacion) / 2;
        } while (Math.abs(raizCuadrada - estimacion) > epsilon);

        int raizTruncada = (int) raizCuadrada;
        System.out.println("");
        System.out.println("La raiz cuadrada de " + numero + " es aproximadamente: " + raizTruncada);

        scanner.close();
    }
}

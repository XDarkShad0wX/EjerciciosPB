import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        System.out.print("||");
        int num = scanner.nextInt();
        int sumaN = 0;
        int numeroA = Math.abs(num);

        while (numeroA != 0) {
            int digito = numeroA % 10;
            sumaN += digito;
            numeroA /= 10;
        }

        System.out.println("La suma de los dígitos es: " + sumaN);

        scanner.close();
    }
}

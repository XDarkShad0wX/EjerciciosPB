import java.util.Scanner;

public class Ejercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero");
        System.out.print("||");
        int num = scanner.nextInt();

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println("");
            System.out.println("- El número " + num + " es primo.");
        } else {
            System.out.println("");
            System.out.println("- El número " + num + " no es primo.");
        }

        scanner.close();
    }
}

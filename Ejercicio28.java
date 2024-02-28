import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para hacer una cuenta atras: ");
        System.out.print("||");
        int num = scanner.nextInt();

        System.out.println("");
        System.out.println("La cuenta atras de " + num + " es: ");
        for (int i = num; i >= 0; i--) {
            System.out.println("- " + i);
        }
        
        scanner.close();
    }
}

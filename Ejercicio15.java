import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        System.out.print("||");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        scanner.close();
    }
}

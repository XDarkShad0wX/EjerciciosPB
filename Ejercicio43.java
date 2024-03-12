import java.util.Scanner;
public class Ejercicio43 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos Numeros: ");
        System.out.println("");

        System.out.println("Primer Numero: ");
        System.out.print("||");
        int num1 = scanner.nextInt();

        System.out.println("Segundo Numero: ");
        System.out.print("||");
        int num2 = scanner.nextInt();

        if(num1 < num2) {
            System.out.println("El número menor entre " + num1 + " y " + num2 + " es: " + num1);
        } else {
            System.out.println("El número menor entre " + num1 + " y " + num2 + " es: " + num2);
        }

        scanner.close();
    }
}

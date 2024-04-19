import java.util.Scanner;

public class Ejercicio162 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingresa un numero positivo menor o igual a 9: ");
        System.out.print("||");
        int numero = scanner.nextInt();
        
        if (numero < 1 || numero >= 10) {
            System.out.println("");
            System.out.println("///// El numero ingresado es mayor de o igual a 10 /////");
            return;
        }
        System.out.println("");
        System.out.println("Tabla de multiplicar del " + numero + " es:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio182 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese un numero entero (menor o igual a 1000): ");
        System.out.print("||");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 1000) {
            System.out.println("");
            System.out.println("//// El numero debe estar entre 1 a 1000 ////");
            return;
        }

        String numeroRomano = "";
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                numeroRomano += simbolos[i];
                numero -= valores[i];
            }
        }

        System.out.println("");
        System.out.println("El numero " + numero + " en numeros romanos es: " + numeroRomano);

        scanner.close();
    }
}

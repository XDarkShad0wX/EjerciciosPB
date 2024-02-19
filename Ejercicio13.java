import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese 3 numeros: ");
            System.out.println("");

            System.out.println("numero 1: ");
            System.out.print("||");
            float num1 = scanner.nextFloat();

            System.out.println("numero 2: ");
            System.out.print("||");
            float num2 = scanner.nextFloat();

            System.out.println("numero 3: ");
            System.out.print("||");
            float num3 = scanner.nextFloat();

            int ultimoDigito1 = (int) (num1 % 10);
            int ultimoDigito2 = (int) (num2 % 10);
            int ultimoDigito3 = (int) (num3 % 10);

            System.out.println("---------------------------------------------------------------");
            System.out.println("- El ultimo dígito del numero " + num1 + " es: " + ultimoDigito1);
            System.out.println("- El ultimo dígito del numero " + num2 + " es: " + ultimoDigito2);
            System.out.println("- El ultimo dígito del numero " + num3 + " es: " + ultimoDigito3);
            System.out.println("---------------------------------------------------------------");


        } catch (Exception SoloNumeros) {
            System.out.println("/// Debe ingresar un -Numero- ///");
        } finally {
            scanner.close();
        }
    }
}

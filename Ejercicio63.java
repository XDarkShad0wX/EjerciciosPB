import java.util.Scanner;

public class Ejercicio63 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int num;
        int suma = 0;

        do {
            System.out.println("");
            System.out.println("// Ingrese cualquier numero escepto el rango de (20-30] (0 - para finalizar el programa) //");
            System.out.print("||");
            num = scanner.nextInt();

            if (num < 20 || num > 30) {
                suma += num;
            }

        } while (num != 0 && (num < 20 || num > 30));

        System.out.println("La suma de los numeros ingesados mayores a 0 fueron: " + suma);

        scanner.close();
    }
}

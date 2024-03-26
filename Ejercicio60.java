import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int num;

        do {
            System.out.println("");
            System.out.println("// Ingrese cualquier numero (0 para finalizar el programa) //");
            System.out.print("|| ");
            num = scanner.nextInt();

            if (num > 0) {
                i++;
            }

        } while(num != 0);

        System.out.println("La cantidad de numeros ingesados mayores a 0 fueron: " + i);

        scanner.close();
    }
}

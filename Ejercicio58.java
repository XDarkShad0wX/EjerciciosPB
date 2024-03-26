import java.util.Scanner;
public class Ejercicio58 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese las horas trabajadas");
        System.out.print("||");
        int horas = scanner.nextInt();

        System.out.println("");
        System.out.println("Ingrese el valor por horas de trabajo");
        System.out.print("||");
        int valorH = scanner.nextInt();

        int salario = horas * valorH;

        System.out.println("");
        System.out.println("El salario va a ser de: " + salario);

        scanner.close();
    }
}

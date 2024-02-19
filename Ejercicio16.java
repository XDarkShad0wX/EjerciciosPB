import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota sacada en el examen: ");
        System.out.print("||");
        float nota = scanner.nextFloat();

        if (nota >= 3) {
            System.out.println("Ganó el examen ;)");
        } else {
            System.out.println("Perdió el examen :(");
        }

        scanner.close();
    }
}

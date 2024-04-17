import java.util.Scanner;

public class Ejercicio105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese cuatro notas mayores a 20 ///");
        System.out.println("");

        System.out.print("- Primera nota: ");
        float nota1 = scanner.nextFloat();

        System.out.print("- Segunda nota: ");
        float nota2 = scanner.nextFloat();

        System.out.print("- Tercera nota: ");
        float nota3 = scanner.nextFloat();

        System.out.print("- Cuarta nota: ");
        float nota4 = scanner.nextFloat();

        float promedio = (nota1 + nota2 + nota3 + nota4) / 4;

        if (promedio > 14.5) {
            System.out.println("");
            System.out.println("APROBADO");
        } else if (promedio > 10) {
            System.out.println("");
            System.out.println("SUPLETORIO");
        } else {
            System.out.println("");
            System.out.println("PERDIDO EL AÑO");
        }

        scanner.close();
    }
}

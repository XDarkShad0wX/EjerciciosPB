import java.util.Scanner;

public class Ejercicio165 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingresa tu peso en kg: ");
        System.out.print("||");
        double peso = scanner.nextDouble();

        System.out.println("");
        System.out.println("Ingresa tu estatura en metros: ");
        System.out.print("||");
        double estatura = scanner.nextDouble();
        
        double imc = peso / (estatura * estatura);
        
        String categoria;
        if (imc < 18.5) {
            categoria = "Bajo peso";
        } else if (imc < 25) {
            categoria = "Normal";
        } else if (imc < 30) {
            categoria = "Sobrepeso";
        } else {
            categoria = "Obesidad";
        }

        System.out.println("");
        System.out.println("///// Informacion /////");
        System.out.println("- \nTu IMC es: " + imc);
        System.out.println("- Categoría: " + categoria);

        scanner.close();
    }
}

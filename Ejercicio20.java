import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 notas para Calcular: ");
        System.out.println("");

        System.out.println("Nota 1: ");
        System.out.print("||");
        float nota1 = scanner.nextFloat();

        System.out.println("Nota 2: ");
        System.out.print("||");
        float nota2 = scanner.nextFloat();

        System.out.println("Nota 3: ");
        System.out.print("||");
        float nota3 = scanner.nextFloat();

        System.out.println("Nota 4: ");
        System.out.print("||");
        float nota4 = scanner.nextFloat();

        System.out.println("Nota 5: ");
        System.out.print("||");
        float nota5 = scanner.nextFloat();

        float suma = nota1 + nota2 + nota3 + nota4 + nota5;
        float promedio = suma / 5;
        float dobleN1 = nota1 * 2;
        float dobleN2 = nota2 * 2;
        float dobleN3 = nota3 * 2;
        float dobleN4 = nota4 * 2;
        float dobleN5 = nota5 * 2;

        System.out.println("Resultado: ");
        System.out.println("");

        System.out.println("----------------------------------------------------");
        System.out.println("- La suma de las notas es de: " + suma);
        System.out.println("- El promedio de las notas es de " + promedio);
        System.out.println("- El doble de la nota " + nota1 + " es de: " + dobleN1);
        System.out.println("- El doble de la nota " + nota2 + " es de: " + dobleN2);
        System.out.println("- El doble de la nota " + nota3 + " es de: " + dobleN3);
        System.out.println("- El doble de la nota " + nota4 + " es de: " + dobleN4);
        System.out.println("- El doble de la nota " + nota5 + " es de: " + dobleN5);
        System.out.println("----------------------------------------------------");

        scanner.close();
    }
}

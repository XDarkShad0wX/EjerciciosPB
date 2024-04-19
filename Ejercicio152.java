import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una cadena de caracteres: ");
        System.out.print("||");
        String cadena = scanner.nextLine();

        char[] caracteres = cadena.toCharArray();

        char[] copiaCaracteres = new char[caracteres.length];
        System.arraycopy(caracteres, 0, copiaCaracteres, 0, caracteres.length);

        System.out.println("");
        System.out.println("Contenido del arreglo copiado:");
        for (char c : copiaCaracteres) {
            System.out.print(c);
        }
        System.out.println();

        scanner.close();
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio192 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el texto (máximo 255 caracteres):");
        System.out.print("||");
        String texto = scanner.nextLine();

        if (texto.length() > 255) {
            System.out.println("");
            System.out.println("//// No puede ingresar mas de 255 caracteres ////");
            return;
        }

        String nombreArchivo = "texto.txt";

        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo);

            fileWriter.write(texto);

            fileWriter.close();

            System.out.println("");
            System.out.println("--- El texto se ha escrito correctamente en el archivo ---");
        } catch (IOException e) {
            System.out.println("");
            System.err.println("//// No se puede escribir en el archivo: " + e.getMessage() + " ////");
        }

        scanner.close();
    }
}

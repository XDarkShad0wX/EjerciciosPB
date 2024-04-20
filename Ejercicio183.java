import java.util.Scanner;

public class Ejercicio183 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingrese el nombre completo de la persona: ");
        System.out.print("||");
        String nombreCompleto = scanner.nextLine();

        nombreCompleto = nombreCompleto.toLowerCase();
        char[] nombreArray = nombreCompleto.toCharArray();
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        int totalVocales = 0;

        for (char letra : nombreArray) {
            switch (letra) {
                case 'a':
                    contadorA++;
                    totalVocales++;
                    break;
                case 'e':
                    contadorE++;
                    totalVocales++;
                    break;
                case 'i':
                    contadorI++;
                    totalVocales++;
                    break;
                case 'o':
                    contadorO++;
                    totalVocales++;
                    break;
                case 'u':
                    contadorU++;
                    totalVocales++;
                    break;
            }
        }

        System.out.println("");
        System.out.println("----------------------------------------------------------");
        System.out.println("\nTotal de vocales en el nombre completo: " + totalVocales);
        System.out.println("Número de 'a' en el nombre completo: " + contadorA);
        System.out.println("Número de 'e' en el nombre completo: " + contadorE);
        System.out.println("Número de 'i' en el nombre completo: " + contadorI);
        System.out.println("Número de 'o' en el nombre completo: " + contadorO);
        System.out.println("Número de 'u' en el nombre completo: " + contadorU);

        scanner.close();
    }
}

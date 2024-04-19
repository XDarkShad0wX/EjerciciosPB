import java.util.Scanner;

public class Ejercicio158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Ingresa una cadena de caracteres:");
        System.out.print("||");
        String cadena = scanner.nextLine().toLowerCase();

        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            switch (caracter) {
                case 'a':
                    contadorA++;
                    break;
                case 'e':
                    contadorE++;
                    break;
                case 'i':
                    contadorI++;
                    break;
                case 'o':
                    contadorO++;
                    break;
                case 'u':
                    contadorU++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("");
        System.out.println("Cantidad de ocurrencias de cada vocal:");
        System.out.println("- A: " + contadorA);
        System.out.println("- E: " + contadorE);
        System.out.println("- I: " + contadorI);
        System.out.println("- O: " + contadorO);
        System.out.println("- U: " + contadorU);

        scanner.close();
    }
}

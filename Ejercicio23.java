import java.util.Random;
import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random aleatorio = new Random();

        int[] AleatoriosP = new int[3];
        AleatoriosP[0] = aleatorio.nextInt(9) + 1;
        do {
            AleatoriosP[1] = aleatorio.nextInt(9) + 1;
        } while (AleatoriosP[1] == AleatoriosP[0]);
        do {
            AleatoriosP[2] = aleatorio.nextInt(9) + 1;
        } while (AleatoriosP[2] == AleatoriosP[0] || AleatoriosP[2] == AleatoriosP[1]);

        

        int intentos = 0;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            intentos++;

            System.out.println("Intento " + intentos + ": ");
            System.out.print("||");

            int[] intento = new int[3];
            for (int i = 0; i < 3; i++) {
                intento[i] = scanner.nextInt();
                System.out.print("||");
            }

            StringBuilder pista = new StringBuilder();

            for (int i = 0; i < 3; i++) {
                if (intento[i] == AleatoriosP[i]) {
                    pista.append("[VERDE] ");
                } else if (contains(AleatoriosP, intento[i])) {
                    pista.append("[AMARILLO] ");
                } else {
                    pista.append("[ROJO] ");
                }
            }

            System.out.println("Pista: " + pista.toString().trim());

            if (pista.toString().trim().equals("[VERDE] [VERDE] [VERDE]")) {
                juegoTerminado = true;
            }
        }

        System.out.println("Adivinaste los dígitos en " + intentos + " intentos.");

        scanner.close();
    }

    private static boolean contains(int[] array, int num) {
        for (int value : array) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
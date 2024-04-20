import java.time.Year;
import java.util.Scanner;

public class Ejercicio169 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int añoActual = Year.now().getValue();

        System.out.println("Ingresa tu año de nacimiento: ");
        System.out.print("||");
        int añoNacimiento = scanner.nextInt();

        int edad = añoActual - añoNacimiento;

        if (edad < 1 || edad > 100) {
            System.out.println("");
            System.out.println("//// Esa edad no esta permitida ////");
            return;
        }

        String etapaVida;
        if (edad <= 12) {
            etapaVida = "Niñez (1-12 años)";
        } else if (edad <= 18) {
            etapaVida = "Adolescencia (13-18 años)";
        } else if (edad <= 30) {
            etapaVida = "Juventud (19-30 años)";
        } else if (edad <= 60) {
            etapaVida = "Adultez (31-60 años)";
        } else {
            etapaVida = "Vejez (60-100 años)";
        }

        System.out.println("");
        System.out.println("Estás en la etapa de " + etapaVida);

        scanner.close();
    }
}

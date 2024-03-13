import java.util.Scanner;
public class Ejercicio46 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas para convertir a metros");
        System.out.print("||");
        int distancia = scanner.nextInt();

        int milla = 1852;
        int metros;

        if (distancia != 1) {
            metros = distancia * milla;
            System.out.println("la distancia " + distancia + " en Millas es igual a " + metros + " Metros");

        } else {
            System.out.println("la distancia " + distancia + " en Millas es igual a " + milla + " Metros");
        }

        scanner.close();
    }
}

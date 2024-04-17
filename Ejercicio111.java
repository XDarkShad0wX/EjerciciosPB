import java.util.Scanner;

public class Ejercicio111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero de dia (1-7): ");
        System.out.print("||");
        int numDia = scanner.nextInt();

        String dia;
        switch (numDia) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miércoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "//// Ninguno ////";
        }

        System.out.println("");
        System.out.println("El numero " + numDia + " corresponde al dia: " + dia);

        scanner.close();
    }
}

import java.util.Scanner;

public class Ejercicio127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("/// Ingrese la fecha ///");
        System.out.println("");

        System.out.println("- Dia: ");
        System.out.print("||");
        int dia = scanner.nextInt();

        System.out.println("- Mes: ");
        System.out.print("||");
        int mes = scanner.nextInt();

        String estacion = "";
        switch (mes) {
            case 1: case 2:
                estacion = "Invierno";
                break;
            case 3:
                estacion = (dia < 21) ? "Invierno" : "Primavera";
                break;
            case 4: case 5:
                estacion = "Primavera";
                break;
            case 6:
                estacion = (dia < 21) ? "Primavera" : "Verano";
                break;
            case 7: case 8:
                estacion = "Verano";
                break;
            case 9:
                estacion = (dia < 21) ? "Verano" : "Otoño";
                break;
            case 10: case 11:
                estacion = "Otoño";
                break;
            case 12:
                estacion = (dia < 21) ? "Otoño" : "Invierno";
                break;
            default:
                estacion = "/// [Error] El numero que ingresó en el mes no es valido ///";
                break;
        }

        System.out.println("");
        System.out.println("La fecha corresponde a la estacion: " + estacion);

        scanner.close();
    }
}

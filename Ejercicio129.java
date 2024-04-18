import java.util.Scanner;

public class Ejercicio129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del mes: ");
        System.out.print("||");
        int mes = scanner.nextInt();

        System.out.println("");
        System.out.println("Ingrese el año: ");
        System.out.print("||");
        int año = scanner.nextInt();

        int dias;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ? 29 : 28;
                break;
            default:
                dias = -1;
                break;
        }

        if (dias != -1) {
            System.out.println("");
            System.out.println("Numero días del mes " + mes + " del año " + año + " es: " + dias);
        } else {
            System.out.println("");
            System.out.println("/// No existe ese numero de mes ///");
        }

        scanner.close();
    }
}

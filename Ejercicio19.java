import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el sueldo del trabajador: ");
        System.out.print("||");
        int sueldoT = scanner.nextInt();
        System.out.println("Ingrese el monto por horas Extra: ");
        System.out.print("||");
        int horasE = scanner.nextInt();

        int totalG = sueldoT + horasE;
        double descuento = totalG * 0.20;


        System.out.println("------------------------------------");
        System.out.println("- Sueldo Basico: " + sueldoT);
        System.out.println("- Total de descuento: " + descuento);
        System.out.println("- Total Ganado " + totalG);
        System.out.println("------------------------------------");

        scanner.close();
    }
}

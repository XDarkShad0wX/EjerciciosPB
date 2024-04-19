import java.util.Scanner;

public class Ejercicio140 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("");
            System.out.println("///////// Menu /////////");
            System.out.println("- Ingrese una opcion: ");
            System.out.println("1) Salir");
            System.out.println("2) Sumatoria");
            System.out.println("3) Factorial");
            System.out.println("---------------------------");
            System.out.print("||");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("///// Ha salido del programa /////");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("-[Sumatoria]- Ingrese un numero: ");
                    System.out.print("||");
                    int numSumatoria = scanner.nextInt();

                    int sumatoria = 0;

                    for (int i = 1; i <= numSumatoria; i++) {
                        sumatoria += i;
                    }

                    System.out.println("");
                    System.out.println("- La sumatoria de " + numSumatoria + " es: " + sumatoria);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("-[Factorial]- Ingrese un numero: ");
                    System.out.print("||");
                    int numFactorial = scanner.nextInt();

                    long factorial = 1;
                    for (int i = 1; i <= numFactorial; i++) {
                        factorial *= i;
                    }

                    System.out.println("");
                    System.out.println("- El factorial de " + numFactorial + " es: " + factorial);
                    break;
                default:
                    System.out.println("");
                    System.out.println("//// Opcion no valida ////");
                    break;
            }
        } while (opcion != 1);

        scanner.close();
    }
}

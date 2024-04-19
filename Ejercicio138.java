import java.util.Scanner;

public class Ejercicio138 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("");
            System.out.println("///////////// Menu /////////////");
            System.out.println("- Ingrese una opcion: ");
            System.out.println("1. Calcular area de un cuadrado");
            System.out.println("2. Calcular area de un circulo");
            System.out.println("3. Calcular area de un triangulo");
            System.out.println("0. Salir");
            System.out.println("--------------------------------");
            System.out.print("||");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.println("Ingrese el lado del cuadrado: ");
                    System.out.print("");
                    double lado = scanner.nextDouble();

                    double areaCuadrado = lado * lado;

                    System.out.println("");
                    System.out.println("-_-_-/ El area del cuadrado es: " + areaCuadrado + " /-_-_-");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Ingrese el radio del círculo: ");
                    System.out.print("||");
                    double radio = scanner.nextDouble();

                    double areaCirculo = Math.PI * radio * radio;

                    System.out.println("");
                    System.out.println("-_-_-/ El area del circulo es: " + areaCirculo + " /-_-_-");
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Ingrese la base del triangulo: ");
                    System.out.print("||");
                    double base = scanner.nextDouble();

                    System.out.println("");
                    System.out.print("Ingrese la altura del triangulo: ");
                    System.out.print("||");
                    double altura = scanner.nextDouble();

                    double areaTriangulo = (base * altura) / 2;

                    System.out.println("");
                    System.out.println("-_-_-/ El area del triangulo es: " + areaTriangulo + " /-_-_-");
                    break;
                case 0:
                    System.out.println("");
                    System.out.println("//// Ha salido del programa ////");
                    break;
                default:
                    System.out.println("");
                    System.out.println("//// Opcion no valida ////");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}

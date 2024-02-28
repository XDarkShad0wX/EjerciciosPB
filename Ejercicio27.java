import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean generoX = false;

        while (!generoX) {

            System.out.println("Ingrese su Nombre: ");
            System.out.print("||");
            String Name = scanner.nextLine();

            System.out.println("");
            System.out.println("Ingrese su Genero (Masculino, Femenino, otros...): ");
            System.out.print("||");
            String Genero = scanner.nextLine();

            if (Genero.toString().trim().equals("Masculino")) {
                generoX = true;

                System.out.println("");
                System.out.println("Biemvenido " + Name);
                break;
            }else{
                if (Genero.toString().trim().equals("Femenino")) {
                    generoX = true;

                    System.out.println("");
                    System.out.println("Biemvenido " + Name);
                    break;
                }else{
                    System.out.println("");
                    System.out.println("Biemvenido " + Name);
                    System.out.println("- Hola indeciso");
                    break;
                }
            }
        }

        scanner.close();
    }
}
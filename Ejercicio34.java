import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto completo de la compra: ");
        System.out.print("||");
        int montoC = scanner.nextInt();

        float totalpagar;
        double descuento1 = 0.10;
        double descuento2 = 0.20;

        if (montoC > 1000){
            totalpagar = (float) (montoC - (montoC*descuento1));
            System.out.println("El total a pagar es de: " + totalpagar);
        }else
            if (montoC > 500 && montoC <= 1000){
                totalpagar = (float) (montoC - (montoC*descuento2));
                System.out.println("El total a pagar es de: " + totalpagar);

            }else{
                System.out.println("El total a pagar es de: " + montoC);
            }

        scanner.close();
    }
}

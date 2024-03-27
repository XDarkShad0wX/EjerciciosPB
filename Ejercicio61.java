public class Ejercicio61 {
    public static void main(String[] args) throws Exception {

        int x;
        int suma = 0;

        for (int i = 1; i <= 10; i++) {
            x = (int) Math.pow(i, 2);
            suma += x;
        }

        System.out.println("La suma de los cuadrados de los 10 primeros numeros es: " + suma);

    }
}

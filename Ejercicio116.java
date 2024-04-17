public class Ejercicio116 {
    public static void main(String[] args) {

        int sumaPar = 0;
        long multiplicacionImpar = 1;

        for (int i = 1; i <= 1000; i++) {
            System.out.println("");
            System.out.println(i);

            if (i % 2 == 0) {
                sumaPar += i;
            }
        }

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                multiplicacionImpar *= i;
            }
        }

        System.out.println("");
        System.out.println("La suma de los numeros pares entre 1 y 1000 es: " + sumaPar);
        System.out.println("La multiplicacion de los numeros impares entre 1 y 50 es: " + multiplicacionImpar);
    }
}

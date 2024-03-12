public class Ejercicio44 {
    public static void main(String[] args) throws Exception {
        double pi = Math.PI;

        for (int i = 2; i <= 10; i++) {
            double potencia = Math.pow(pi, i);
            double raiz = Math.sqrt(potencia);

            System.out.println(" La potencia de PI a la " + i + " es : " + potencia);
            System.out.println("Raíz cuadrada de la potencia es : " + raiz);
        }
    }
}

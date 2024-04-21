public class Ejercicio200 {
    public static void main(String[] args) {

        double capitalInicial = 1000.0;

        double tasaInteresMensual = 1.5 / 100.0;

        int meses = 2;

        double montoFinal = capitalInicial * Math.pow(1 + tasaInteresMensual, meses);

        System.out.println("");
        System.out.println("Después de " + meses + " meses, el monto final será: $" + montoFinal);
    }
}

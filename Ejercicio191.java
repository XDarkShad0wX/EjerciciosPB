import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio191 {
    public static void main(String[] args) {

        String rutaArchivo = "archivo.txt";

        try {
            FileReader fileReader = new FileReader(rutaArchivo);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.err.println("No se puede leer el archivo: " + e.getMessage());
        }
    }
}

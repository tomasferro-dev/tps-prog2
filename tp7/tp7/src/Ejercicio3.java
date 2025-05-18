import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
    public  void ejercicio3() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese el nombre del archivo
            System.out.print("Ingrese el nombre del archivo de texto: ");
            String nombreArchivo = scanner.nextLine();

            // Intentar leer el archivo
            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);

            // Mostrar el contenido del archivo en la consola
            System.out.println("Contenido del archivo:");
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            // Cerrar el lector
            lector.close();

        } catch (FileNotFoundException e) {
            // Manejar la excepción de archivo no encontrado
            System.out.println("Error: El archivo no se encontró.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}

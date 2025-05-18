import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese el nombre del archivo
            System.out.print("Ingrese el nombre del archivo de texto: ");
            String nombreArchivo = scanner.nextLine();

            // Utilizar try-with-resources para abrir y cerrar automáticamente el BufferedReader
            try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
                String linea;
                System.out.println("Contenido del archivo:");
                // Leer y mostrar el contenido del archivo línea por línea
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                // Manejar la excepción de entrada/salida
                System.out.println("Error: No se pudo leer el archivo. " + e.getMessage());
            }

        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}

import java.util.Scanner;

public class Ejercicio4 {
    public  void ejercicio4() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese su edad
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            // Validar la edad
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("La edad ingresada es inválida. Debe ser un valor entre 0 y 120.");
            }

            // Mostrar la edad ingresada
            System.out.println("La edad ingresada es: " + edad);

        } catch (EdadInvalidaException e) {
            // Manejar la excepción de edad inválida
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Manejar otras excepciones posibles (por ejemplo, entrada no válida)
            System.out.println("Error: Entrada no válida. Por favor, ingrese un número entero.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}

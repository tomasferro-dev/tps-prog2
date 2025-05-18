import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese una cadena de texto
            System.out.print("Ingrese una cadena de texto que represente un número entero: ");
            String cadena = scanner.nextLine();

            // Intentar convertir la cadena a un número entero
            int numero = Integer.parseInt(cadena);
            System.out.println("La conversión fue exitosa. El número es: " + numero);

        } catch (NumberFormatException e) {
            // Manejar la excepción de formato numérico no válido
            System.out.println("Error: La cadena ingresada no es un número entero válido.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}

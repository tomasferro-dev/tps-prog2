import java.util.Scanner;

public class Ejercicio1 {
    Scanner scanner = new Scanner(System.in);
    public void ejercicio1() {
        try {
            // Solicitar al usuario que ingrese los dos números enteros
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = scanner.nextInt();

            // Realizar la división
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            // Manejar la excepción de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } catch (Exception e) {
            // Manejar otras excepciones posibles (por ejemplo, entrada no válida)
            System.out.println("Error: Entrada no válida. Por favor, ingrese números enteros.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }

}

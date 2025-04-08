import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario que introduzca dos números
            System.out.print("Introduce el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double numero2 = scanner.nextDouble();

            // Realizar las operaciones y mostrar los resultados
            System.out.println("Resultados:");
            System.out.println("Suma: " + (numero1 + numero2));
            System.out.println("Resta: " + (numero1 - numero2));
            System.out.println("Multiplicación: " + (numero1 * numero2));

            try {
                // Manejar división
                System.out.println("División: " + (numero1 / numero2));
            } catch (ArithmeticException e) {
                System.out.println("Error en la división: " + e.getMessage());
            }

            try {
                // Manejar módulo
                System.out.println("Módulo: " + (numero1 % numero2));
            } catch (ArithmeticException e) {
                System.out.println("Error en el módulo: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error en la entrada: Por favor, introduce valores válidos. " + e.getMessage());
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }
}


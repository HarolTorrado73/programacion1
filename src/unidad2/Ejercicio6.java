import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Leer número de mes
        int numeroMes = leerNumeroMes(scanner);

        // Mostrar información del mes
        mostrarInformacionMes(numeroMes, nombresMeses, diasMeses);

        scanner.close();
    }

    // Método para leer el número de mes
    private static int leerNumeroMes(Scanner scanner) {
        int numeroMes;
        do {
            System.out.print("Introduce un número de mes (1-12): ");
            numeroMes = scanner.nextInt();
            if (numeroMes < 1 || numeroMes > 12) {
                System.out.println("Error: El número de mes debe estar entre 1 y 12");
            }
        } while (numeroMes < 1 || numeroMes > 12);
        return numeroMes;
    }

    // Método para mostrar la información del mes
    private static void mostrarInformacionMes(int numeroMes, String[] nombresMeses, int[] diasMeses) {
        System.out.println("\nInformación del mes:");
        System.out.println("--------------------");
        System.out.println("Nombre del mes: " + nombresMeses[numeroMes - 1]);
        System.out.println("Días del mes: " + diasMeses[numeroMes - 1]);
    }
} 
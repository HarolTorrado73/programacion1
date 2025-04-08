import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[3]; // Ejemplo con 3 conductores
        int[][] kms = new int[3][5]; // 5 días por conductor
        int[] totalKms = new int[3];

        // Leer datos de conductores
        leerDatosConductores(nombres, kms, scanner);

        // Calcular total de kilómetros
        calcularTotalKms(kms, totalKms);

        // Mostrar resultados
        mostrarResultados(nombres, kms, totalKms);

        scanner.close();
    }

    // Método para leer datos de conductores
    private static void leerDatosConductores(String[] nombres, int[][] kms, Scanner scanner) {
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("\nConductor %d:%n", i + 1);
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();

            System.out.println("Kilómetros por día:");
            for (int j = 0; j < kms[i].length; j++) {
                System.out.printf("Día %d: ", j + 1);
                kms[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Limpiar el buffer
        }
    }

    // Método para calcular el total de kilómetros por conductor
    private static void calcularTotalKms(int[][] kms, int[] totalKms) {
        for (int i = 0; i < kms.length; i++) {
            totalKms[i] = 0;
            for (int j = 0; j < kms[i].length; j++) {
                totalKms[i] += kms[i][j];
            }
        }
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(String[] nombres, int[][] kms, int[] totalKms) {
        System.out.println("\nResumen de kilómetros por conductor:");
        System.out.println("----------------------------------");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("\nConductor: %s%n", nombres[i]);
            System.out.println("Kilómetros por día:");
            for (int j = 0; j < kms[i].length; j++) {
                System.out.printf("Día %d: %d km%n", j + 1, kms[i][j]);
            }
            System.out.printf("Total de kilómetros: %d km%n", totalKms[i]);
        }
    }
} 
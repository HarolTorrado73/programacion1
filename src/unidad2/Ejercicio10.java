import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];

        // Cargar la matriz
        cargarMatriz(matriz, scanner);

        // Mostrar la matriz
        mostrarMatriz(matriz);

        // Calcular y mostrar sumas
        mostrarSumas(matriz);

        scanner.close();
    }

    // Método para cargar la matriz con valores
    private static void cargarMatriz(int[][] matriz, Scanner scanner) {
        System.out.println("Introduce los valores para la matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Valor para posición [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para mostrar la matriz
    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("\nMatriz:");
        System.out.println("-------");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%d\t", valor);
            }
            System.out.println();
        }
    }

    // Método para calcular y mostrar las sumas
    private static void mostrarSumas(int[][] matriz) {
        System.out.println("\nSumas de filas y columnas:");
        System.out.println("-------------------------");

        // Suma de filas
        System.out.println("Suma de filas:");
        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.printf("Fila %d: %d%n", i + 1, sumaFila);
        }

        // Suma de columnas
        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.printf("Columna %d: %d%n", j + 1, sumaColumna);
        }
    }
} 
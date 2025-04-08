public class Ejercicio11 {
    public static void main(String[] args) {
        int[][] diagonal = new int[5][5];

        // Inicializar la matriz diagonal
        inicializarMatrizDiagonal(diagonal);

        // Mostrar la matriz
        mostrarMatriz(diagonal);
    }

    // Método para inicializar la matriz diagonal
    private static void inicializarMatrizDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Si está en la diagonal principal (i == j), asignar 1
                // Si no está en la diagonal, asignar 0
                matriz[i][j] = (i == j) ? 1 : 0;
            }
        }
    }

    // Método para mostrar la matriz
    private static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz diagonal:");
        System.out.println("----------------");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
} 
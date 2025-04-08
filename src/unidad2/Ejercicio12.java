public class Ejercicio12 {
    public static void main(String[] args) {
        int[][] marco = new int[5][15];

        // Inicializar la matriz marco
        inicializarMatrizMarco(marco);

        // Mostrar la matriz
        mostrarMatrizMarco(marco);
    }

    // Método para inicializar la matriz marco
    private static void inicializarMatrizMarco(int[][] matriz) {
        // Inicializar todo con ceros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }

        // Marcar los bordes con unos
        // Primera y última fila
        for (int j = 0; j < matriz[0].length; j++) {
            matriz[0][j] = 1;
            matriz[matriz.length - 1][j] = 1;
        }

        // Primera y última columna
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][0] = 1;
            matriz[i][matriz[i].length - 1] = 1;
        }
    }

    // Método para mostrar la matriz marco
    private static void mostrarMatrizMarco(int[][] matriz) {
        System.out.println("Matriz marco:");
        System.out.println("-------------");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor);
            }
            System.out.println();
        }
    }
} 
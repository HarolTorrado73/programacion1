import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vectorNumeros = new int[10];
        Random random = new Random();

        // Inicializar vector con números aleatorios
        inicializarVector(vectorNumeros, random);

        // Mostrar vector original
        System.out.println("Vector original:");
        mostrarVector(vectorNumeros);

        // Ordenar vector
        ordenarVector(vectorNumeros);

        // Mostrar vector ordenado
        System.out.println("\nVector ordenado:");
        mostrarVector(vectorNumeros);
    }

    // Método para inicializar el vector con números aleatorios
    private static void inicializarVector(int[] vector, Random random) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100); // Números entre 0 y 99
        }
    }

    // Método para ordenar el vector (usando el algoritmo de burbuja)
    private static void ordenarVector(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar elementos
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }

    // Método para mostrar el vector
    private static void mostrarVector(int[] vector) {
        System.out.println(Arrays.toString(vector));
    }
} 
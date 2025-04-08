import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Declaración del vector de 10 elementos
        int[] vectorNumeros = new int[10];
        Random random = new Random();

        // Inicialización del vector con números aleatorios
        inicializarVector(vectorNumeros, random);

        // Mostrar resultados
        mostrarResultados(vectorNumeros);
    }

    // Método para inicializar el vector con números aleatorios
    private static void inicializarVector(int[] vector, Random random) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(10) + 1; // Números entre 1 y 10
        }
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(int[] vector) {
        System.out.println("Numero\tCuadrado\tCubo");
        System.out.println("------------------------");
        for (int numero : vector) {
            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            System.out.printf("%d\t%d\t\t%d%n", numero, cuadrado, cubo);
        }
    }
} 
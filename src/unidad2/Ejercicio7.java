import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        // Leer valores para vector1
        System.out.println("Introduce valores para el primer vector:");
        leerVector(vector1, scanner);

        // Leer valores para vector2
        System.out.println("\nIntroduce valores para el segundo vector:");
        leerVector(vector2, scanner);

        // Calcular suma de vectores
        sumarVectores(vector1, vector2, vector3);

        // Mostrar resultados
        mostrarResultados(vector1, vector2, vector3);

        scanner.close();
    }

    // Método para leer valores de un vector
    private static void leerVector(int[] vector, Scanner scanner) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
    }

    // Método para sumar los vectores
    private static void sumarVectores(int[] vector1, int[] vector2, int[] vector3) {
        for (int i = 0; i < vector3.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(int[] vector1, int[] vector2, int[] vector3) {
        System.out.println("\nResultados:");
        System.out.println("-----------");
        System.out.println("Vector 1\tVector 2\tVector 3 (Suma)");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < vector1.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d%n", vector1[i], vector2[i], vector3[i]);
        }
    }
} 
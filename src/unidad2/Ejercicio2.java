import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vectorOriginal = new String[5];
        String[] vectorInverso = new String[5];

        // Leer datos del teclado
        leerDatos(vectorOriginal, scanner);

        // Copiar en orden inverso
        copiarInverso(vectorOriginal, vectorInverso);

        // Mostrar resultados
        mostrarResultados(vectorOriginal, vectorInverso);

        scanner.close();
    }

    // Método para leer datos del teclado
    private static void leerDatos(String[] vector, Scanner scanner) {
        System.out.println("Introduce 5 cadenas de caracteres:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Cadena " + (i + 1) + ": ");
            vector[i] = scanner.nextLine();
        }
    }

    // Método para copiar el vector en orden inverso
    private static void copiarInverso(String[] original, String[] inverso) {
        for (int i = 0; i < original.length; i++) {
            inverso[i] = original[original.length - 1 - i];
        }
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(String[] original, String[] inverso) {
        System.out.println("\nVector original:");
        mostrarVector(original);
        
        System.out.println("\nVector inverso:");
        mostrarVector(inverso);
    }

    // Método auxiliar para mostrar un vector
    private static void mostrarVector(String[] vector) {
        for (String elemento : vector) {
            System.out.println(elemento);
        }
    }
} 
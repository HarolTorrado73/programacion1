import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Leer las notas
        leerNotas(notas, scanner);

        // Calcular y mostrar resultados
        mostrarResultados(notas);

        scanner.close();
    }

    // Método para leer las notas
    private static void leerNotas(double[] notas, Scanner scanner) {
        System.out.println("Introduce 5 notas (entre 0 y 10):");
        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Error: La nota debe estar entre 0 y 10");
                }
            } while (notas[i] < 0 || notas[i] > 10);
        }
    }

    // Método para calcular la media
    private static double calcularMedia(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para encontrar la nota más alta
    private static double encontrarNotaMaxima(double[] notas) {
        double maxima = notas[0];
        for (double nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }
        return maxima;
    }

    // Método para encontrar la nota más baja
    private static double encontrarNotaMinima(double[] notas) {
        double minima = notas[0];
        for (double nota : notas) {
            if (nota < minima) {
                minima = nota;
            }
        }
        return minima;
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(double[] notas) {
        System.out.println("\nResultados:");
        System.out.println("-----------");
        System.out.println("Notas introducidas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f%n", i + 1, notas[i]);
        }
        System.out.printf("%nNota media: %.2f%n", calcularMedia(notas));
        System.out.printf("Nota más alta: %.2f%n", encontrarNotaMaxima(notas));
        System.out.printf("Nota más baja: %.2f%n", encontrarNotaMinima(notas));
    }
} 
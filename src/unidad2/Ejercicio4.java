import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vectorNumeros = new int[10];
        int elementosIntroducidos = 0;

        // Leer números hasta llenar el vector o introducir un negativo
        elementosIntroducidos = leerNumeros(vectorNumeros, scanner);

        // Mostrar resultados
        mostrarResultados(vectorNumeros, elementosIntroducidos);

        scanner.close();
    }

    // Método para leer números
    private static int leerNumeros(int[] vector, Scanner scanner) {
        int contador = 0;
        System.out.println("Introduce números enteros (negativo para terminar):");
        
        while (contador < vector.length) {
            System.out.print("Número " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            vector[contador] = numero;
            contador++;
        }
        
        return contador;
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(int[] vector, int elementosIntroducidos) {
        System.out.println("\nElementos introducidos:");
        System.out.println("----------------------");
        for (int i = 0; i < elementosIntroducidos; i++) {
            System.out.printf("Posición %d: %d%n", i + 1, vector[i]);
        }
        System.out.printf("%nTotal de elementos introducidos: %d%n", elementosIntroducidos);
    }
} 
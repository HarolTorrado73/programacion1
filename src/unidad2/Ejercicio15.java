import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] equipos = new String[15][2]; // 15 partidos, 2 equipos por partido
        int[][] resultados = new int[15][2]; // 15 partidos, 2 resultados por partido

        // Leer datos de equipos y resultados
        leerDatosQuiniela(equipos, resultados, scanner);

        // Mostrar resultados
        mostrarResultadosQuiniela(equipos, resultados);

        scanner.close();
    }

    // Método para leer datos de la quiniela
    private static void leerDatosQuiniela(String[][] equipos, int[][] resultados, Scanner scanner) {
        System.out.println("Introduce los datos de los 15 partidos:");
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("\nPartido %d:%n", i + 1);
            
            // Leer equipos
            System.out.print("Equipo local: ");
            equipos[i][0] = scanner.nextLine();
            System.out.print("Equipo visitante: ");
            equipos[i][1] = scanner.nextLine();
            
            // Leer resultados
            System.out.print("Goles equipo local: ");
            resultados[i][0] = scanner.nextInt();
            System.out.print("Goles equipo visitante: ");
            resultados[i][1] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }
    }

    // Método para mostrar los resultados
    private static void mostrarResultadosQuiniela(String[][] equipos, int[][] resultados) {
        System.out.println("\nResultados de la quiniela:");
        System.out.println("--------------------------");
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("Partido %d: %s %d - %d %s%n", 
                            i + 1, 
                            equipos[i][0], 
                            resultados[i][0], 
                            resultados[i][1], 
                            equipos[i][1]);
        }
    }
} 
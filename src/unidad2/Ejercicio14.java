import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] precios = new double[5];
        int[][] cantidades = new int[4][5]; // 4 sucursales, 5 artículos

        // Leer precios de artículos
        leerPrecios(precios, scanner);

        // Leer cantidades vendidas
        leerCantidades(cantidades, scanner);

        // Mostrar resultados
        mostrarResultados(precios, cantidades);

        scanner.close();
    }

    // Método para leer precios de artículos
    private static void leerPrecios(double[] precios, Scanner scanner) {
        System.out.println("Introduce los precios de los 5 artículos:");
        for (int i = 0; i < precios.length; i++) {
            System.out.printf("Precio del artículo %d: ", i + 1);
            precios[i] = scanner.nextDouble();
        }
    }

    // Método para leer cantidades vendidas
    private static void leerCantidades(int[][] cantidades, Scanner scanner) {
        System.out.println("\nIntroduce las cantidades vendidas por sucursal:");
        for (int i = 0; i < cantidades.length; i++) {
            System.out.printf("\nSucursal %d:%n", i + 1);
            for (int j = 0; j < cantidades[i].length; j++) {
                System.out.printf("Cantidad del artículo %d: ", j + 1);
                cantidades[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para mostrar los resultados
    private static void mostrarResultados(double[] precios, int[][] cantidades) {
        // Cantidades totales por artículo
        System.out.println("\nCantidades totales por artículo:");
        System.out.println("--------------------------------");
        for (int j = 0; j < cantidades[0].length; j++) {
            int total = 0;
            for (int i = 0; i < cantidades.length; i++) {
                total += cantidades[i][j];
            }
            System.out.printf("Artículo %d: %d unidades%n", j + 1, total);
        }

        // Cantidad en sucursal 2
        System.out.println("\nCantidades en sucursal 2:");
        System.out.println("-------------------------");
        for (int j = 0; j < cantidades[1].length; j++) {
            System.out.printf("Artículo %d: %d unidades%n", j + 1, cantidades[1][j]);
        }

        // Cantidad del artículo 3 en sucursal 1
        System.out.printf("%nCantidad del artículo 3 en sucursal 1: %d unidades%n", cantidades[0][2]);

        // Recaudación por sucursal
        System.out.println("\nRecaudación por sucursal:");
        System.out.println("-------------------------");
        double recaudacionTotal = 0;
        int sucursalMayorRecaudacion = 0;
        double mayorRecaudacion = 0;

        for (int i = 0; i < cantidades.length; i++) {
            double recaudacionSucursal = 0;
            for (int j = 0; j < cantidades[i].length; j++) {
                recaudacionSucursal += cantidades[i][j] * precios[j];
            }
            System.out.printf("Sucursal %d: %.2f€%n", i + 1, recaudacionSucursal);
            recaudacionTotal += recaudacionSucursal;

            if (recaudacionSucursal > mayorRecaudacion) {
                mayorRecaudacion = recaudacionSucursal;
                sucursalMayorRecaudacion = i + 1;
            }
        }

        System.out.printf("%nRecaudación total de la empresa: %.2f€%n", recaudacionTotal);
        System.out.printf("Sucursal con mayor recaudación: Sucursal %d (%.2f€)%n", 
                         sucursalMayorRecaudacion, mayorRecaudacion);
    }
} 
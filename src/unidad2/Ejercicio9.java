import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturasMinimas = new double[5];
        double[] temperaturasMaximas = new double[5];

        // Leer temperaturas
        leerTemperaturas(temperaturasMinimas, temperaturasMaximas, scanner);

        // Mostrar temperaturas medias
        mostrarTemperaturasMedias(temperaturasMinimas, temperaturasMaximas);

        // Mostrar días con menor temperatura
        mostrarDiasMenorTemperatura(temperaturasMinimas);

        // Buscar días por temperatura máxima
        buscarPorTemperaturaMaxima(temperaturasMaximas, scanner);

        scanner.close();
    }

    // Método para leer las temperaturas
    private static void leerTemperaturas(double[] minimas, double[] maximas, Scanner scanner) {
        System.out.println("Introduce las temperaturas mínimas y máximas de 5 días:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("\nDía %d:%n", i + 1);
            System.out.print("Temperatura mínima: ");
            minimas[i] = scanner.nextDouble();
            System.out.print("Temperatura máxima: ");
            maximas[i] = scanner.nextDouble();
        }
    }

    // Método para mostrar las temperaturas medias
    private static void mostrarTemperaturasMedias(double[] minimas, double[] maximas) {
        System.out.println("\nTemperaturas medias por día:");
        System.out.println("----------------------------");
        for (int i = 0; i < 5; i++) {
            double media = (minimas[i] + maximas[i]) / 2;
            System.out.printf("Día %d: %.2f°C%n", i + 1, media);
        }
    }

    // Método para mostrar los días con menor temperatura
    private static void mostrarDiasMenorTemperatura(double[] minimas) {
        double menorTemp = minimas[0];
        for (double temp : minimas) {
            if (temp < menorTemp) {
                menorTemp = temp;
            }
        }

        System.out.println("\nDías con menor temperatura:");
        System.out.println("---------------------------");
        for (int i = 0; i < minimas.length; i++) {
            if (minimas[i] == menorTemp) {
                System.out.printf("Día %d: %.2f°C%n", i + 1, menorTemp);
            }
        }
    }

    // Método para buscar días por temperatura máxima
    private static void buscarPorTemperaturaMaxima(double[] maximas, Scanner scanner) {
        System.out.print("\nIntroduce una temperatura máxima para buscar: ");
        double temperaturaBuscar = scanner.nextDouble();

        System.out.println("\nDías con la temperatura máxima especificada:");
        System.out.println("------------------------------------------");
        boolean encontrado = false;
        for (int i = 0; i < maximas.length; i++) {
            if (maximas[i] == temperaturaBuscar) {
                System.out.printf("Día %d: %.2f°C%n", i + 1, temperaturaBuscar);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron días con esa temperatura máxima.");
        }
    }
} 
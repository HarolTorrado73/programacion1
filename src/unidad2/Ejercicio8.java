import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();

        // Leer datos de alumnos
        leerDatosAlumnos(nombres, edades, scanner);

        // Mostrar resultados
        mostrarResultados(nombres, edades);

        scanner.close();
    }

    // Método para leer datos de alumnos
    private static void leerDatosAlumnos(ArrayList<String> nombres, ArrayList<Integer> edades, Scanner scanner) {
        System.out.println("Introduce los datos de los alumnos (nombre '*' para terminar):");
        
        while (true) {
            System.out.print("\nNombre del alumno: ");
            String nombre = scanner.nextLine();
            
            if (nombre.equals("*")) {
                break;
            }
            
            System.out.print("Edad del alumno: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            nombres.add(nombre);
            edades.add(edad);
        }
    }

    // Método para mostrar alumnos mayores de edad
    private static void mostrarMayoresDeEdad(ArrayList<String> nombres, ArrayList<Integer> edades) {
        System.out.println("\nAlumnos mayores de edad:");
        System.out.println("------------------------");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) >= 18) {
                System.out.printf("%s: %d años%n", nombres.get(i), edades.get(i));
            }
        }
    }

    // Método para mostrar los alumnos más mayores
    private static void mostrarAlumnosMayores(ArrayList<String> nombres, ArrayList<Integer> edades) {
        if (nombres.isEmpty()) {
            return;
        }

        // Encontrar la edad máxima
        int edadMaxima = edades.get(0);
        for (int edad : edades) {
            if (edad > edadMaxima) {
                edadMaxima = edad;
            }
        }

        // Mostrar alumnos con la edad máxima
        System.out.println("\nAlumnos más mayores:");
        System.out.println("--------------------");
        for (int i = 0; i < nombres.size(); i++) {
            if (edades.get(i) == edadMaxima) {
                System.out.printf("%s: %d años%n", nombres.get(i), edades.get(i));
            }
        }
    }

    // Método para mostrar todos los resultados
    private static void mostrarResultados(ArrayList<String> nombres, ArrayList<Integer> edades) {
        mostrarMayoresDeEdad(nombres, edades);
        mostrarAlumnosMayores(nombres, edades);
    }
} 
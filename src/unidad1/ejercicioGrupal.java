import java.util.Scanner;

public class ejercicioGrupal {
    public static void main(String[] args) {
        // Declaración de constantes
        int numeroEstudiantes = 5; // Cantidad fija de estudiantes
        int numeroAsignaturas = 3; // Cantidad fija de asignaturas
        double promedioMinimoAprobacion = 3.0; // Promedio mínimo para aprobar

        // Declaración de variables
        String[] nombresEstudiantes = new String[numeroEstudiantes]; // Nombres de estudiantes
        String[] identificacionesEstudiantes = new String[numeroEstudiantes]; // Identificaciones de estudiantes
        double[][] calificacionesEstudiantes = new double[numeroEstudiantes][numeroAsignaturas]; // Matriz de calificaciones

        // Escáner para entrada de datos
        Scanner input = new Scanner(System.in);

        // Captura de datos
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ":");
            nombresEstudiantes[i] = input.nextLine();

            System.out.println("Ingrese la identificación del estudiante " + (i + 1) + ":");
            identificacionesEstudiantes[i] = input.nextLine();

            System.out.println("Ingrese las " + numeroAsignaturas + " notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < numeroAsignaturas; j++) {
                System.out.print("Nota " + (j + 1) + ": ");
                calificacionesEstudiantes[i][j] = input.nextDouble();
            }
            input.nextLine(); // Consumir salto de línea
        }

        // Generación del reporte final
        System.out.println("\nReporte Final:");
        for (int i = 0; i < numeroEstudiantes; i++) {
            // Cálculo del promedio
            double sumaNotas = 0;
            for (int j = 0; j < numeroAsignaturas; j++) {
                sumaNotas += calificacionesEstudiantes[i][j];
            }
            double promedioNotas = sumaNotas / numeroAsignaturas;

            // Determinar estado de aprobación
            String estado;
            if (promedioNotas >= promedioMinimoAprobacion) {
                estado = "Aprobado";
            } else {
                estado = "Reprobado";
            }

            // Imprimir reporte
            System.out.println(nombresEstudiantes[i] + " (ID: " + identificacionesEstudiantes[i] + 
                    ") - Promedio: " + String.format("%.2f", promedioNotas) + " - Estado: " + estado);
        }

        input.close(); // Cerramos el escáner

    }
}

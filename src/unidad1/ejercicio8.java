
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingresar la cantidad total de las preguntas
        System.out.print("Ingrese la cantidad total de preguntas: ");
        int totalPreguntas = input.nextInt();

        // Ingresar la cantidad de preguntas que son correctas
        System.out.print("Ingrese la cantidad de preguntas contestadas correctamente: ");
        int correctas = input.nextInt();

        // Validar para que no sea 0
        if (totalPreguntas <= 0) {
            System.out.println("Error: La cantidad total de preguntas debe ser mayor a cero.");
        } else if (correctas < 0 || correctas > totalPreguntas) {
            System.out.println("Error: La cantidad de respuestas correctas no es válida.");
        } else {
            // Calcular el porcentaje de respuestas correctas
            double porcentaje = (double) correctas / totalPreguntas * 100;

            // Determinar el nivel del postulante
            if (porcentaje >= 90) {
                System.out.println("Nivel máximo");
            } else if (porcentaje >= 75) {
                System.out.println("Nivel medio");
            } else if (porcentaje >= 50) {
                System.out.println("Nivel regular");
            } else {
                System.out.println("Fuera de nivel");
            }
        }

        // Cerrar el scanner
        input.close();
    }
}

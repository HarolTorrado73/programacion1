import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar la cantidad de empleados
        System.out.print("Ingrese la cantidad de empleados: ");
        int n = input.nextInt();

        int entre100y300 = 0; // Contador para sueldos entre $100 y $300
        int mayor300 = 0; // Contador para sueldos mayores a $300
        double sumaSueldos = 0; // Acumulador para el gasto total

        // Leer los sueldos de cada empleado
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            double sueldo = input.nextDouble();

            // Clasificar el sueldo
            if (sueldo >= 100 && sueldo <= 300) {
                entre100y300++;
            } else if (sueldo > 300 && sueldo <= 500) {
                mayor300++;
            }

            // Sumar al gasto total
            sumaSueldos += sueldo;
        }

        // Mostrar resultados
        System.out.println("Cantidad de empleados que cobran entre $100 y $300: " + entre100y300);
        System.out.println("Cantidad de empleados que cobran más de $300: " + mayor300);
        System.out.println("Gasto total de la empresa en sueldos: $" + sumaSueldos);


        // Calcular el promedio de sueldos
        input.close();
    }
}

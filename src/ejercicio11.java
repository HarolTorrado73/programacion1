import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingresar sueldo y años de antiguedad
        System.out.print("Ingrese el sueldo del operario: ");
        double sueldo = input.nextDouble();
        System.out.print("Ingrese los años de antigüedad del operario: ");
        int antiguedad = input.nextInt();

        // Determinar y calcular según las condiciones
        if (sueldo < 500 && antiguedad >= 10) {
            sueldo = sueldo + (sueldo * 0.20); // Aumento del 20%
            System.out.println("Sueldo a pagar (con aumento del 20%): " + sueldo);
        } else if (sueldo < 500 && antiguedad < 10) {
            sueldo = sueldo + (sueldo * 0.05); // Aumento del 5%
            System.out.println("Sueldo a pagar (con aumento del 5%): " + sueldo);
        } else if (sueldo >= 500) {
            System.out.println("Sueldo a pagar (sin cambios): " + sueldo);
        }


        // Cerrar el scanner
        input.close();
    }
}


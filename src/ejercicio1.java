import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();
        
        if (num1 > num2) {
            double suma = num1 + num2;
            double diferencia = num1 - num2;
            System.out.println("El primer número es mayor. Resultados:");
            System.out.println("Suma: " + suma);
            System.out.println("Diferencia: " + diferencia);
        } else {
            double producto = num1 * num2;
            if (num2 != 0) {
                double division = num1 / num2;
                System.out.println("El segundo número es mayor o igual. Resultados:");
                System.out.println("Producto: " + producto);
                System.out.println("División: " + division);
            } else {
                System.out.println("El segundo número es mayor o igual. Resultados:");
                System.out.println("Producto: " + producto);
                System.out.println("División: No es posible dividir por cero.");
            }
        }
        
        input.close();
    }
}
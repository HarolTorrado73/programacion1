import java.util.Scanner;

public class ejercicio7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingresar un número entero positivo
        System.out.print("Ingrese un número entero positivo de hasta tres cifras: ");
        int numero = input.nextInt();

        // Verificar si el número es válido (positivo)
        if (numero < 1) {
            System.out.println("Error: El número debe ser positivo.");
        } else if (numero < 10) { // Una cifra
            System.out.println("El número tiene 1 cifra.");
        } else if (numero < 100) { // Dos cifras
            System.out.println("El número tiene 2 cifras.");
        } else if (numero < 1000) { // Tres cifras
            System.out.println("El número tiene 3 cifras.");
        } else { // Más de tres cifras
            System.out.println("Error: El número tiene más de tres cifras.");
        }

        input.close();
    }
}

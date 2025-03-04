import java.util.Scanner;

public class Mayormenor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();

        // Comprobar si el primer número es mayor que el segundo y menor que el tercero
        if (numero1 > numero2 && numero1 < numero3) {
            System.out.println("El primer número es mayor que el segundo y menor que el tercero.");
        } else {
            System.out.println("El primer número NO es mayor que el segundo y menor que el tercero.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
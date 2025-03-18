import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Se ingresa un valor entero por teclado
        System.out.print("Ingrese un número entero: ");
        int numero = input.nextInt();

        // Verificar si el número es positivo, negativo o nulo
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es nulo (cero).");
        }

        input.close();
    }
}


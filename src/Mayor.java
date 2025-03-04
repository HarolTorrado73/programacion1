import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int numero3 = scanner.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor es: " + numero1);
        } else if (numero2 > numero3) {
            System.out.println("El mayor es: " + numero2);
        } else {
            System.out.println("El mayor es: " + numero3);
        }

        scanner.close();
    }
}


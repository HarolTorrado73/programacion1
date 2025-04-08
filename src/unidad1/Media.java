import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Introduce el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar el segundo número
        System.out.print("Introduce el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Solicitar el tercer número
        System.out.print("Introduce el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcular la media
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado
        System.out.println("La media de los tres números es: " + media);

        // Cerrar el scanner
        scanner.close();
    }
}

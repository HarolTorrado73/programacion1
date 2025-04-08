import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Validación del número para que sea positivo y de uno o dos dígitos hasta el 99.
        int numero;
        do {
            System.out.print("Ingrese un número positivo de uno o dos dígitos (1-99): ");
            numero = input.nextInt();

        // Validación del número
        } while (numero < 1 || numero > 99);
        
        // Determinar si el número tiene un dígito o dos dígitos.
        if (numero >= 10) {
            System.out.println("El número tiene dos dígitos.");
        } else {
            System.out.println("El número tiene un dígito.");
        }
        
        
        input.close();
    }
}

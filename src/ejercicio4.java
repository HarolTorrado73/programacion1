import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el sueldo de la personas en dólares: ");
        double saldoPersona = input.nextDouble();

        if (saldoPersona > 3000) {
            System.out.println("La persona debe abonar recaudo de impuestos.");
        } else {
            System.out.println("La persona no debe abonar recaudo de impuestos.");
        }

        //se cierra el input
        input.close();

    }
}

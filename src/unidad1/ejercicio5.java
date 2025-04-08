import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Se le pide al usuario que ingrese un número double
        System.out.print("Ingrese el primer número:");
        double numero1 = input.nextDouble();

        double numero2;
        do { 
            System.out.print("ingrese un segundo numero: ");
            numero2 = input.nextDouble();
            if (numero2 == numero1) {
                System.out.println("Los numeros ingresados son iguales. ingrese otro número:");
            }
            
        } while (numero2 == numero1);

        // Se compara el número mayor con el segundo
        if (numero1 > numero2){
            System.out.println("El numero mayor es: " + numero1);
        } else {
            System.out.println("El numero mayor es: " + numero2);
        }
        input.close();
    }
}

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //se ingresa las tres notas
        System.out.println("Ingrese las tres notas del alumno:");
        
        System.out.print("Nota 1: ");
        double nota1 = input.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = input.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = input.nextDouble();
        

        //se calcula el promedio de las tres notas
        double promedio = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("El promedio es: " + promedio);
        
        //se determina si el alumno ha sido promocionado o no
        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else {
            System.out.println("No promocionado");
        }
        
        //se cierra el scanner
        input.close();
    }
}

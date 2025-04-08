import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int notasMayoresIguales7 = 0; // Contador para notas mayores o iguales a 7
        int notasMenores7 = 0; // Contador para notas menores a 7

        // Ciclo para ingresar las notas
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            double nota = input.nextDouble();

            // Evaluar si la nota es >= 7 o < 7
            if (nota >= 7) {
                notasMayoresIguales7++;
            } else {
                notasMenores7++;
            }
        }

        // Mostrar resultados
        System.out.println("Cantidad de notas mayores o iguales a 7: " + notasMayoresIguales7);
        System.out.println("Cantidad de notas menores a 7: " + notasMenores7);


        // Cerrar el scanner
        input.close();
    }
}


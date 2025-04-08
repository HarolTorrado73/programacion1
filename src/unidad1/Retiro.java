public class Retiro {
    public static void main(String[] args) {
        // Cantidad inicial en la cuenta bancaria
        double saldoInicial = 1000.0;
        // Cantidad a retirar cada semana
        double retiroSemanal = 200.0;
        // Número de semanas en un mes
        int semanasEnMes = 4;
        // Cálculo del saldo final
        double saldoFinal = saldoInicial - (retiroSemanal * semanasEnMes);
        // Mostrar resultados
        System.out.println("Saldo inicial: $" + saldoInicial);
        for (int semana = 1; semana <= semanasEnMes; semana++) {
            System.out.println("Semana " + semana + ": se retiran $" + retiroSemanal);
        }
        System.out.println("Saldo final después de un mes: $" + saldoFinal);
    }
}


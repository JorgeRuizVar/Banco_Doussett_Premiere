import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private String titular;
    private String nip;
    private double saldo;
    private List<String> historial;

    // Constructor
    public Cuenta(String titular, String nip, double saldoInicial) {
        this.titular = titular;
        this.nip = nip;
        this.saldo = saldoInicial;
        this.historial = new ArrayList<>(); // Inicializamos la lista de historial
        historial.add("Cuenta creada con saldo inicial: $" + saldo); // Primer movimiento
    }

    // Métodos de acceso
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Método para validar el NIP
    public boolean validarNip(String intento) {
        return this.nip.equals(intento);
    }

    // Método para realizar depósitos
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            historial.add("Depósito de: $" + cantidad + " | Nuevo saldo: $" + saldo); // Registrar movimiento
        }
    }

    // Método para realizar retiros
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            historial.add("Retiro de: $" + cantidad + " | Nuevo saldo: $" + saldo); // Registrar movimiento
            return true;
        }
        historial.add("Intento de retiro fallido de: $" + cantidad + " | Saldo insuficiente.");
        return false;
    }

    // Método para cambiar el NIP
    public void cambiarNip(String nuevoNip) {
        this.nip = nuevoNip;
        historial.add("Cambio de NIP realizado."); // Registrar el cambio de NIP
    }

    // Método para mostrar el historial de movimientos
    public void mostrarHistorial() {
        System.out.println("\n📜 HISTORIAL DE MOVIMIENTOS:");
        if (historial.isEmpty()) {
            System.out.println("No hay movimientos registrados.");
        } else {
            for (String movimiento : historial) {
                System.out.println(" - " + movimiento);
            }
        }
    }
}

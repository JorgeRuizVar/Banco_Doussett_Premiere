import java.util.*;

public class Cajero {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Cuenta> cuentas = new ArrayList<>();

    public static void main(String[] args) {
        cargarCuentas();

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║     Banco Doussett Premiere    ║");
        System.out.println("║      Bienvenido al sistema     ║");
        System.out.println("╚════════════════════════════════╝");

        Cuenta cuentaActiva = seleccionarCuenta();

        if (cuentaActiva != null) {
            if (verificarAcceso(cuentaActiva)) {
                menuPrincipal(cuentaActiva);
            } else {
                System.out.println("Demasiados intentos fallidos. Tarjeta retirada.");
            }
        }
    }

    // Cargar cuentas predeterminadas
    public static void cargarCuentas() {
        cuentas.add(new Cuenta("Jorge Doussett", "1234", 5000.0));
        cuentas.add(new Cuenta("Enrique Doussett", "5678", 2500.0));
        cuentas.add(new Cuenta("Ruiz Vargas", "9012", 10000.0));
    }

    // Selección de cuenta activa
    public static Cuenta seleccionarCuenta() {
        System.out.println("\nSeleccione su cuenta:");
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println((i + 1) + ". " + cuentas.get(i).getTitular());
        }

        int opcion = sc.nextInt();
        sc.nextLine(); // Limpiar buffer
        if (opcion >= 1 && opcion <= cuentas.size()) {
            return cuentas.get(opcion - 1);
        }
        System.out.println("Opción inválida.");
        return null;
    }

    // Verificar acceso mediante el NIP
    public static boolean verificarAcceso(Cuenta cuenta) {
        int intentos = 3;
        while (intentos > 0) {
            System.out.print("Ingrese su NIP de 4 dígitos: ");
            String nipIngresado = sc.nextLine();

            if (cuenta.validarNip(nipIngresado)) {
                return true;
            } else {
                intentos--;
                System.out.println("NIP incorrecto. Intentos restantes: " + intentos);
            }
        }
        return false;
    }

    // Menú principal para interactuar con la cuenta
    public static void menuPrincipal(Cuenta cuenta) {
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Consulta de saldo");
            System.out.println("2. Retiro de efectivo");
            System.out.println("3. Depósito en efectivo");
            System.out.println("4. Cambiar NIP");
            System.out.println("5. Ver historial de movimientos");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + cuenta.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    if (cuenta.retirar(retiro)) {
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = sc.nextDouble();
                    cuenta.depositar(deposito);
                    System.out.println("Depósito exitoso. Nuevo saldo: $" + cuenta.getSaldo());
                    break;
                case 4:
                    cambiarNip(cuenta);
                    break;
                case 5:
                    cuenta.mostrarHistorial(); // Mostrar historial de movimientos
                    break;
                case 6:
                    System.out.println("Gracias por usar Banco Doussett Premiere. Hasta pronto.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);
    }

    // Cambiar NIP
    public static void cambiarNip(Cuenta cuenta) {
        System.out.print("Ingrese su NIP actual: ");
        String actual = sc.nextLine();

        if (cuenta.validarNip(actual)) {
            System.out.print("Ingrese nuevo NIP: ");
            String nuevo = sc.nextLine();
            System.out.print("Confirme nuevo NIP: ");
            String confirmacion = sc.nextLine();

            if (nuevo.equals(confirmacion)) {
                cuenta.cambiarNip(nuevo);
                System.out.println("NIP actualizado correctamente.");
            } else {
                System.out.println("Los NIP no coinciden.");
            }
        } else {
            System.out.println("NIP actual incorrecto.");
        }
    }
}


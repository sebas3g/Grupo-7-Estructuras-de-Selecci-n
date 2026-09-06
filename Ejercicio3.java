import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 500;
        double monto;
        int opcion;

        do {

            System.out.println("\n===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Saldo disponible: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: $");
                    monto = entrada.nextDouble();

                    if (monto > 0) {
                        saldo = saldo + monto;
                        System.out.println("Depósito realizado correctamente.");
                        System.out.println("Saldo actualizado: $" + saldo);
                    } else {
                        System.out.println("El monto debe ser positivo.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: $");
                    monto = entrada.nextDouble();

                    if (monto > 0 && monto <= 500 && monto <= saldo) {
                        saldo = saldo - monto;
                        System.out.println("Retiro realizado correctamente.");
                        System.out.println("Saldo actualizado: $" + saldo);
                    } else {
                        System.out.println("Retiro no válido.");
                        System.out.println("El monto debe ser positivo,");
                        System.out.println("no superar $500 ni exceder el saldo disponible.");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por utilizar el cajero.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);
    }
}

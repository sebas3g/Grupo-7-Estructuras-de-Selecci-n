import java.util.Scanner;

public class FacturacionCafeteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion, cantidad;
        double subtotal = 0, precio = 0;

        do {
            System.out.println("\n===== MENÚ CAFETERÍA =====");
            System.out.println("1. Café ($1.50)");
            System.out.println("2. Sándwich ($2.50)");
            System.out.println("3. Jugo ($1.75)");
            System.out.println("4. Ensalada ($3.00)");
            System.out.println("5. Finalizar compra");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: precio = 1.50; break;
                case 2: precio = 2.50; break;
                case 3: precio = 1.75; break;
                case 4: precio = 3.00; break;
                case 5: System.out.println("Procesando factura..."); break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese la cantidad: ");
                cantidad = sc.nextInt();

                if (cantidad > 0) {
                    subtotal += precio * cantidad;
                    System.out.printf("Producto agregado. Subtotal actual: $%.2f%n", subtotal);
                } else {
                    System.out.println("Error: La cantidad debe ser positiva.");
                }
            }

        } while (opcion != 5);

        if (subtotal > 0) {
            double pctDescuento;

            if (subtotal < 10.00) {
                pctDescuento = 0.00;
            } else if (subtotal <= 19.99) {
                pctDescuento = 0.05;
            } else if (subtotal <= 49.99) {
                pctDescuento = 0.10;
            } else {
                pctDescuento = 0.15;
            }

            double descuento = subtotal * pctDescuento;
            double total = subtotal - descuento;

            System.out.println("\n=== FACTURA FINAL ===");
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Descuento (%.0f%%): $%.2f%n", (pctDescuento * 100), descuento);
            System.out.printf("Total a pagar: $%.2f%n", total);
        } else {
            System.out.println("No se realizaron compras.");
        }
    }
}

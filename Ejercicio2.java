package tarea1;
import java.util.Scanner;
public class multiplicacion {
    

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int opcion;

        do {

            // Solicitar número
            System.out.print("Ingrese un número entre 1 y 12: ");
            numero = entrada.nextInt();

            // Validar número
            if (numero >= 1 && numero <= 12) {

                System.out.println("\n===== MENÚ =====");
                System.out.println("1. Tabla ascendente");
                System.out.println("2. Tabla descendente");
                System.out.println("3. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = entrada.nextInt();

                switch (opcion) {

                    case 1:
                        System.out.println("\nTabla ascendente del " + numero);

                        for (int i = 1; i <= 12; i++) {
                            System.out.println(numero + " x " + i + " = " + (numero * i));
                        }
                        break;

                    case 2:
                        System.out.println("\nTabla descendente del " + numero);

                        for (int i = 12; i >= 1; i--) {
                            System.out.println(numero + " x " + i + " = " + (numero * i));
                        }
                        break;

                    case 3:
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } else {
                System.out.println("Número inválido. Debe estar entre 1 y 12.");
                opcion = 0;
            }

        } while (opcion != 3);

    
}

}

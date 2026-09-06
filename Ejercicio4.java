import java.util.Scanner;

public class ControlIntentos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String clave;
        int intentos = 0;
        int maxIntentos = 3;

        while (intentos < maxIntentos) {

            System.out.print("Ingrese la contraseña: ");
            clave = entrada.nextLine();

            if (clave.equals("Java2026")) {
                System.out.println("Acceso permitido");
                break;
            } else {
                intentos++;

                if (intentos < maxIntentos) {
                    System.out.println("Contraseña incorrecta.");
                    System.out.println("Intentos restantes: " + (maxIntentos - intentos));
                } else {
                    System.out.println("Contraseña incorrecta.");
                    System.out.println("Usuario bloqueado.");
                }
            }
        }

     
    }
}

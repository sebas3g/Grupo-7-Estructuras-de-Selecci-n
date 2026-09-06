import java.util.Scanner;

public class ClasificacionCalificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota, suma = 0, promedio;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 1; i <= 5; i++) {

            do {
                System.out.print("Ingrese la calificacion " + i + " entre 0 y 10: ");
                nota = sc.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Calificacion invalida. Ingrese un valor entre 0 y 10.");
                }

            } while (nota < 0 || nota > 10);

            suma = suma + nota;

            if (nota >= 9) {
                System.out.println("Clasificacion: Excelente");

            } else if (nota >= 7) {
                System.out.println("Clasificacion: Aprobado");
                aprobados++;

            } else if (nota >= 5) {
                System.out.println("Clasificacion: Supletorio");

            } else {
                System.out.println("Clasificacion: Reprobado");
                reprobados++;
            }
        }

        promedio = suma / 5;

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);

    }
}



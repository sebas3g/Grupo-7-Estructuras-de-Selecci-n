import java.util.Scanner;

public class SistemaAcademico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[100];
        double[] promedios = new double[100];
        double[] asistencias = new double[100];
        String[] estados = new String[100];
        int cantEst = 0;
        int opcion;
        do {
            System.out.println("\n===== SISTEMA ACADÉMICO INTEGRADOR =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar resultados");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    double sumaNotas = 0;
                    for (int i = 1; i <= 3; i++) {
                        double nota;
                        do {
                            System.out.print("Ingrese calificación " + i + " (0-10): ");
                            nota = sc.nextDouble();
                            if (nota < 0 || nota > 10) {
                                System.out.println("Error: Calificación fuera de rango. Intente de nuevo.");
                            }
                        } while (nota < 0 || nota > 10);
                        sumaNotas += nota;
                    }
                    double promedio = sumaNotas / 3.0;
                    double asistencia;
                    do {
                        System.out.print("Ingrese porcentaje de asistencia (0 - 100): ");
                        asistencia = sc.nextDouble();
                        if (asistencia < 0 || asistencia > 100) {
                            System.out.println("Error: Asistencia fuera de rango. Intente de nuevo.");
                        }
                    } while (asistencia < 0 || asistencia > 100);
                    String estado;
                    if (promedio >= 9.0 && asistencia >= 90.0) {
                        estado = "Excelente";
                    } else if (promedio >= 7.0 && asistencia >= 70.0) {
                        estado = "Aprobado";
                    } else if (promedio >= 5.0 && asistencia >= 70.0) {
                        estado = "Supletorio";
                    } else {
                        estado = "Reprobado";
                    }
                    nombres[cantEst] = nombre;
                    promedios[cantEst] = promedio;
                    asistencias[cantEst] = asistencia;
                    estados[cantEst] = estado;
                    cantEst++;
                    System.out.println("¡Estudiante registrado con éxito!");
                    break;
                case 2:
                    if (cantEst > 0) {
                        System.out.println("\n=== LISTA DE ESTUDIANTES ===");
                        for (int i = 0; i < cantEst; i++) {
                            System.out.printf("Nombre: %-15s | Prom: %5.2f | Asis: %5.1f%% | Estado: %s%n",
                                    nombres[i], promedios[i], asistencias[i], estados[i]);
                        }
                    } else {
                        System.out.println("No hay registros cargados.");
                    }
                    break;
                case 3:
                    if (cantEst > 0) {
                        System.out.print("Ingrese el nombre del estudiante a buscar: ");
                        String nomBuscar = sc.nextLine();
                        int pos = 0;
                        boolean encontrado = false;
                        while (pos < cantEst && !encontrado) {
                            if (nombres[pos].equalsIgnoreCase(nomBuscar)) {
                                encontrado = true;
                            } else {
                                pos++;
                            }
                        }
                        if (encontrado) {
                            System.out.println("\n¡Estudiante Encontrado!");
                            System.out.println("Nombre: " + nombres[pos]);
                            System.out.printf("Promedio: %.2f%n", promedios[pos]);
                            System.out.printf("Asistencia: %.1f%%%n", asistencias[pos]);
                            System.out.println("Estado: " + estados[pos]);
                        } else {
                            System.out.println("Estudiante no registrado.");
                        }
                    } else {
                        System.out.println("No hay estudiantes registrados para buscar.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema académico...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
    }
}

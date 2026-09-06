import java.util.Scanner;
public class ProcesamientoEstadistico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cPos = 0, cNeg = 0, cCero = 0;
        int cPar = 0, cImpar = 0, cMult3 = 0;
        int suma = 0;
        System.out.print("Ingrese la cantidad de números a procesar: ");
        int n = sc.nextInt();
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                int num = sc.nextInt();
                if (num > 0) {
                    cPos++;
                } else if (num < 0) {
                    cNeg++;
                } else {
                    cCero++;
                }
                if (num % 2 == 0) {
                    cPar++;
                } else {
                    cImpar++;
                }
                if (num % 3 == 0) {
                    cMult3++;
                }
                suma += num;
            }
            double promedio = (double) suma / n;
            System.out.println("\n=== RESULTADOS ESTADÍSTICOS ===");
            System.out.println("Positivos: " + cPos);
            System.out.println("Negativos: " + cNeg);
            System.out.println("Ceros: " + cCero);
            System.out.println("Pares: " + cPar);
            System.out.println("Impares: " + cImpar);
            System.out.println("Múltiplos de 3: " + cMult3);
            System.out.println("Suma total: " + suma);
            System.out.printf("Promedio: %.2f%n", promedio);
        } else {
            System.out.println("Error: Debe ingresar una cantidad mayor a 0.");
        }
    }
}

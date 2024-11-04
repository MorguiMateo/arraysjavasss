import java.util.Scanner;

public class MediaValoresPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0;
        int countPositivos = 0, countNegativos = 0;

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                countPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                countNegativos++;
            }
        }

        double mediaPositivos = (countPositivos != 0) ? (double) sumaPositivos / countPositivos : 0;
        double mediaNegativos = (countNegativos != 0) ? (double) sumaNegativos / countNegativos : 0;

        System.out.println("Media de los valores positivos: " + mediaPositivos);
        System.out.println("Media de los valores negativos: " + mediaNegativos);

        scanner.close();
    }
}

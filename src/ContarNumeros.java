import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int countPositivos = 0, countNegativos = 0, countCeros = 0;

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int numero : numeros) {
            if (numero > 0) {
                countPositivos++;
            } else if (numero < 0) {
                countNegativos++;
            } else {
                countCeros++;
            }
        }

        System.out.println("Cantidad de números positivos: " + countPositivos);
        System.out.println("Cantidad de números negativos: " + countNegativos);
        System.out.println("Cantidad de ceros: " + countCeros);

        scanner.close();
    }
}

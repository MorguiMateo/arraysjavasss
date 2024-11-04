import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPositivos = 0, sumaNegativos = 0;
        int countPositivos = 0, countNegativos = 0;

        // Leer 10 números por teclado
        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Calcular la suma y el conteo de positivos y negativos
        for (int numero : numeros) {
            if (numero > 0) {
                sumaPositivos += numero;
                countPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                countNegativos++;
            }
        }

        // Calcular las medias
        double mediaPositivos = (countPositivos != 0) ? (double) sumaPositivos / countPositivos : 0;
        double mediaNegativos = (countNegativos != 0) ? (double) sumaNegativos / countNegativos : 0;

        // Mostrar las medias
        System.out.println("Media de los valores positivos: " + mediaPositivos);
        System.out.println("Media de los valores negativos: " + mediaNegativos);

        scanner.close();
    }
}

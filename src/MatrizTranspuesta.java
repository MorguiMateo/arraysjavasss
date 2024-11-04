import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de filas:");
        int filas = scanner.nextInt();
        System.out.println("Introduce el número de columnas:");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[][] matrizTranspuesta = obtenerMatrizTranspuesta(matriz);

        System.out.println("La matriz transpuesta es:");
        mostrarMatriz(matrizTranspuesta);

        scanner.close();
    }

    private static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}

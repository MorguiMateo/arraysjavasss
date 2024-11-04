import java.util.Scanner;

public class SumaMatricesConMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filas = leerEntero("Introduce el número de filas:");
        int columnas = leerEntero("Introduce el número de columnas:");

        int[][] matrizA = crearMatriz(filas, columnas);
        int[][] matrizB = crearMatriz(filas, columnas);

        System.out.println("Introduce los valores de la matriz A:");
        llenarMatriz(matrizA);

        System.out.println("Introduce los valores de la matriz B:");
        llenarMatriz(matrizB);

        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        System.out.println("La matriz suma (C) es:");
        mostrarMatriz(matrizC);

        scanner.close();
    }

    private static int leerEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    private static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    private static void llenarMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }
}

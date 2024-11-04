import java.util.Scanner;

public class CuadradoLatino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el orden del cuadrado latino (N):");
        int n = scanner.nextInt();

        int[][] cuadradoLatino = generarCuadradoLatino(n);

        System.out.println("El cuadrado latino de orden " + n + " es:");
        mostrarMatriz(cuadradoLatino);

        scanner.close();
    }

    private static int[][] generarCuadradoLatino(int n) {
        int[][] cuadradoLatino = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cuadradoLatino[i][j] = (i + j) % n + 1;
            }
        }
        return cuadradoLatino;
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

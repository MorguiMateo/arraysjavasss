import java.util.Scanner;

public class CuadradoMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número impar positivo para el orden del cuadrado mágico:");
        int n = scanner.nextInt();

        while (n % 2 == 0 || n <= 0) {
            System.out.println("Debe ser un número impar positivo. Intente de nuevo:");
            n = scanner.nextInt();
        }

        int[][] cuadradoMagico = generarCuadradoMagico(n);

        System.out.println("El cuadrado mágico de orden " + n + " es:");
        mostrarMatriz(cuadradoMagico);

        scanner.close();
    }

    private static int[][] generarCuadradoMagico(int n) {
        int[][] cuadradoMagico = new int[n][n];

        int numero = 1;
        int fila = 0;
        int columna = n / 2;

        while (numero <= n * n) {
            cuadradoMagico[fila][columna] = numero;
            numero++;

            int nuevaFila = (fila - 1 + n) % n;
            int nuevaColumna = (columna + 1) % n;

            if (cuadradoMagico[nuevaFila][nuevaColumna] != 0) {
                fila = (fila + 1) % n;
            } else {
                fila = nuevaFila;
                columna = nuevaColumna;
            }
        }
        return cuadradoMagico;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elem : fila) {
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }
}

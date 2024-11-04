import java.util.Scanner;

public class MediaPosicionesPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int sumaPares = 0;
        int countPares = 0;

        System.out.println("Introduce 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i += 2) {
            sumaPares += numeros[i];
            countPares++;
        }

        double mediaPares = (countPares != 0) ? (double) sumaPares / countPares : 0;

        System.out.println("Media de los números en posiciones pares: " + mediaPares);

        scanner.close();
    }
}

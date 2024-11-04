public class NumerosPares {
    public static void main(String[] args) {
        int[] pares = new int[20];

        for (int i = 0; i < 20; i++) {
            pares[i] = (i + 1) * 2;
        }

        System.out.println("Los 20 primeros números pares son:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
    }
}

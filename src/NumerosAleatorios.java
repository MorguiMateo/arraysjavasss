import java.util.ArrayList;
import java.util.Collections;

public class NumerosAleatorios {
    public static int[] generarArrayAleatorio(int desde, int hasta, int tam) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for (int i = desde; i <= hasta; i++) {
            listaNumeros.add(i);
        }

        Collections.shuffle(listaNumeros);

        int[] arrayAleatorio = new int[tam];
        for (int i = 0; i < tam; i++) {
            arrayAleatorio[i] = listaNumeros.get(i);
        }

        return arrayAleatorio;
    }

    public static void main(String[] args) {
        int desde = 1;
        int hasta = 50;
        int tam = 10;

        int[] array = generarArrayAleatorio(desde, hasta, tam);

        System.out.println("Array de números aleatorios:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

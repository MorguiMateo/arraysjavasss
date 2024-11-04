import java.util.Scanner;

public class AlturaPersonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de personas:");
        int n = scanner.nextInt();
        double[] alturas = new double[n];
        double sumaAlturas = 0;
        int countSuperior = 0, countInferior = 0;

        System.out.println("Introduce las alturas de las personas:");
        for (int i = 0; i < n; i++) {
            alturas[i] = scanner.nextDouble();
        }

        for (double altura : alturas) {
            sumaAlturas += altura;
        }

        double media = sumaAlturas / n;

        for (double altura : alturas) {
            if (altura > media) {
                countSuperior++;
            } else if (altura < media) {
                countInferior++;
            }
        }

        System.out.println("Altura media: " + media);
        System.out.println("Número de personas con altura superior a la media: " + countSuperior);
        System.out.println("Número de personas con altura inferior a la media: " + countInferior);

        scanner.close();
    }
}

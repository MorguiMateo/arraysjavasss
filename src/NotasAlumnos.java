import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el número de alumnos:");
        int numAlumnos = scanner.nextInt();
        double[] notas = new double[numAlumnos];
        double sumaNotas = 0;

        System.out.println("Introduce las notas de los alumnos:");
        for (int i = 0; i < numAlumnos; i++) {
            notas[i] = scanner.nextDouble();
        }

        for (double nota : notas) {
            sumaNotas += nota;
        }

        double media = sumaNotas / numAlumnos;

        System.out.println("Nota media del grupo: " + media);
        System.out.println("Alumnos con notas superiores a la media:");
        for (int i = 0; i < numAlumnos; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }

        scanner.close();
    }
}

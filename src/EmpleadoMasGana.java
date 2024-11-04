import java.util.Scanner;

public class EmpleadoMasGana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[20];
        double[] sueldos = new double[20];
        double mayorSueldo = 0;
        String nombreMayorSueldo = "";

        System.out.println("Introduce el nombre y el sueldo de 20 empleados:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Empleado " + (i + 1) + " nombre: ");
            nombres[i] = scanner.next();
            System.out.print("Empleado " + (i + 1) + " sueldo: ");
            sueldos[i] = scanner.nextDouble();

            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayorSueldo = nombres[i];
            }
        }

        System.out.println("El empleado que más gana es " + nombreMayorSueldo + " con un sueldo de " + mayorSueldo);

        scanner.close();
    }
}

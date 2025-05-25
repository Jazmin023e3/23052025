import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        double promedio = (double) suma / 12;
        System.out.println("Promedio: " + promedio);
        scanner.close();
    }
}
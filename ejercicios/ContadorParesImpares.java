import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        int[] numeros = new int[12]; // Creamos el vector "números"
        Scanner scanner = new Scanner(System.in);

        // Ingresamos los 12 números en el vector
        System.out.println("Ingresa 12 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contadores de pares e impares
        int pares = 0;
        int impares = 0;

        // Recorremos el vector para contar pares e impares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostramos los resultados
        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        // Cerramos el scanner
        scanner.close();
    }
}

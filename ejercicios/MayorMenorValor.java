import java.util.Scanner;

public class MayorMenorValor {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Creamos el vector "números"
        Scanner scanner = new Scanner(System.in);

        // Ingresamos los 10 números
        System.out.println("Ingresa 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializamos el mayor y menor con el primer número
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el vector para encontrar el mayor y menor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostramos los resultados
        System.out.println("\nEl mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);

        // Cerramos el scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class PuntoDeSilla {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 4;
        int[][] matriz = new int[filas][columnas];
        Scanner scanner = new Scanner(System.in);

        // Llenamos la matriz
        System.out.println("Ingresa los 12 valores numéricos para la matriz 3x4:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Variable para saber si se encontró un punto de silla
        boolean existePuntoDeSilla = false;

        // Buscamos punto de silla
        for (int i = 0; i < filas; i++) {
            // Encontramos el mínimo de la fila i
            int minFila = matriz[i][0];
            int colMin = 0;
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < minFila) {
                    minFila = matriz[i][j];
                    colMin = j;
                }
            }

            // Verificamos si el mínimo de la fila es el máximo de su columna
            int maxColumna = minFila;
            for (int k = 0; k < filas; k++) {
                if (matriz[k][colMin] > maxColumna) {
                    maxColumna = matriz[k][colMin];
                }
            }

            // Si coincide el mínimo de la fila con el máximo de la columna, es punto de silla
            if (minFila == maxColumna) {
                existePuntoDeSilla = true;
                System.out.println("\n¡Punto de silla encontrado!");
                System.out.println("Valor: " + minFila);
                System.out.println("Fila: " + i);
                System.out.println("Columna: " + colMin);
            }
        }

        if (!existePuntoDeSilla) {
            System.out.println("\nNo se encontró ningún punto de silla.");
        }

        // Cerramos el scanner
        scanner.close();
    }
}

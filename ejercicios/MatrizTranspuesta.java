import java.util.Scanner;

public class MatrizTranspuesta {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3]; // Matriz de 3x3
        Scanner scanner = new Scanner(System.in);

        // Llenamos la matriz con los 9 valores numéricos
        System.out.println("Ingresa los 9 valores numéricos:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Valor [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        // Mostramos la matriz original
        System.out.println("\nMatriz original:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        // Mostramos la transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int columna = 0; columna < 3; columna++) { // Intercambiamos filas y columnas
            for (int fila = 0; fila < 3; fila++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        // Cerramos el scanner
        scanner.close();
    }
}

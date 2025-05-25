import java.util.Scanner;

public class MatrizArticulos {
    public static void main(String[] args) {
        String[][] articulos = new String[3][3]; // Matriz 3x3 para 9 artículos
        Scanner scanner = new Scanner(System.in);

        // Llenamos la matriz con los 9 nombres de artículos
        System.out.println("Ingresa los nombres de 9 artículos:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Artículo [" + fila + "][" + columna + "]: ");
                articulos[fila][columna] = scanner.nextLine();
            }
        }

        // Mostramos la matriz con las filas invertidas
        System.out.println("\nContenido de la matriz con filas invertidas:");
        for (int fila = 2; fila >= 0; fila--) { // empezamos desde la última fila
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(articulos[fila][columna] + "\t");
            }
            System.out.println(); // salto de línea después de cada fila
        }

        // Cerramos el scanner
        scanner.close();
    }
}

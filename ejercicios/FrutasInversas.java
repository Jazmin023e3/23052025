import java.util.Scanner;

public class FrutasInversas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[10];

        // Entrada de datos: solicitar al usuario que ingrese 10 nombres de frutas
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingresa el nombre de la fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostrar el contenido del vector en orden inverso
        System.out.println("\nContenido del vector en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        scanner.close();
    }
}
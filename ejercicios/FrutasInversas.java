import java.util.Scanner;

public class FrutasInversas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[10];

    
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingresa el nombre de la fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

    
        System.out.println("\nContenido del vector en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        scanner.close();
    }
}
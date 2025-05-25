import java.util.Scanner;

public class JuegoPreguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntajeTotal = 0;

        // Nivel 1: 3 preguntas
        System.out.println("=== NIVEL 1 ===");

        String[] preguntasNivel1 = {
            "¿Capital de Francia? (a) Madrid (b) París (c) Roma",
            "¿Color del cielo? (a) Rojo (b) Verde (c) Azul",
            "¿Número de patas de una araña? (a) 6 (b) 8 (c) 4"
        };

        char[] respuestasNivel1 = {'b', 'c', 'b'};

        for (int i = 0; i < preguntasNivel1.length; i++) {
            System.out.println(preguntasNivel1[i]);
            System.out.print("Respuesta: ");
            char respuesta = scanner.next().charAt(0);

            if (respuesta == respuestasNivel1[i]) {
                System.out.println("¡Correcto! +10 puntos");
                puntajeTotal += 10;
            } else {
                System.out.println("Incorrecto. -5 puntos");
                puntajeTotal -= 5;
            }
        }

        // Nivel 2: 4 preguntas
        System.out.println("\n=== NIVEL 2 ===");

        String[] preguntasNivel2 = {
            "¿Planeta más cercano al sol? (a) Venus (b) Mercurio (c) Marte",
            "¿5 x 6 = ? (a) 30 (b) 35 (c) 40",
            "¿Animal que ladra? (a) Gato (b) Perro (c) Ratón",
            "¿País más grande del mundo? (a) Canadá (b) China (c) Rusia"
        };

        char[] respuestasNivel2 = {'b', 'a', 'b', 'c'};

        for (int i = 0; i < preguntasNivel2.length; i++) {
            System.out.println(preguntasNivel2[i]);
            System.out.print("Respuesta: ");
            char respuesta = scanner.next().charAt(0);

            if (respuesta == respuestasNivel2[i]) {
                System.out.println("¡Correcto! +20 puntos");
                puntajeTotal += 20;
            } else {
                System.out.println("Incorrecto. -10 puntos");
                puntajeTotal -= 10;
            }
        }

        // Mostrar puntaje total de ambos niveles
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Puntaje acumulado de los dos niveles: " + puntajeTotal);

        // Cerramos el scanner
        scanner.close();
    }
}

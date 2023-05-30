package cafe;
import java.util.Random;
public class cafe {
    public static void main(String[] args) {
        int[] respuestas = new int[30];
        int[] frecuencia = new int[5];
        Random rand = new Random();

        for (int i = 0; i < 30; i++) {
            respuestas[i] = rand.nextInt(5) + 1;
        }

        for (int i = 0; i < 30; i++) {
            frecuencia[respuestas[i] - 1]++;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + frecuencia[i] + " veces");
        }
    }

}//bryan yaziel figueroa castillo

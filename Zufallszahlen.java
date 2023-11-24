package easydatatype;

import java.util.Random;

public class Zufallszahlen {
    public static void main(String[] args) {
        // Erstelle ein Random-Objekt
        Random random = new Random();

        // Gib 10 Zufallszahlen aus
        for (int i = 0; i < 10; i++) {
            int zufallszahl = random.nextInt(100); // Hier wird eine Zufallszahl von 0 bis 99 generiert
            System.out.println("Zufallszahl " + (i + 1) + ": " + zufallszahl);
        }
    }
}

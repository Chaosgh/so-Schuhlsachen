package easydatatype;

import java.util.Random;

public class Würfel_simulieren {
    public static void main(String[] args) {
        // Erzeuge Objekt Random, um zufällige Zahlen zu generieren
        Random random = new Random();
        int maxzahl = 6;//größtmogl zahl
        int minzahl = 1;//kleinstmögl zahl

        // Generiere eine zufällige Zahl zwischen 1 und 6 (einschließlich 1 und 6)
        int wurf = random.nextInt(maxzahl) + minzahl;

        // Gib das Ergebnis aus
        System.out.println("Du hast eine " + wurf + " geworfen!");
    }
}

package easydatatype;

import java.util.Random;

public class W�rfel_simulieren {
    public static void main(String[] args) {
        // Erzeuge Objekt Random, um zuf�llige Zahlen zu generieren
        Random random = new Random();
        int maxzahl = 6;//gr��tmogl zahl
        int minzahl = 1;//kleinstm�gl zahl

        // Generiere eine zuf�llige Zahl zwischen 1 und 6 (einschlie�lich 1 und 6)
        int wurf = random.nextInt(maxzahl) + minzahl;

        // Gib das Ergebnis aus
        System.out.println("Du hast eine " + wurf + " geworfen!");
    }
}

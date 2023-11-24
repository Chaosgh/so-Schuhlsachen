package easydatatype;

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zahl;

        do {
            System.out.print("Bitte geben Sie eine ungerade Zahl ein (0 zum Beenden): ");
            zahl = scanner.nextInt();

            if (zahl == 0) {
                System.out.println("Das Programm wird beendet.");
                break;
            } else if (zahl % 2 == 0) {
                System.out.println("Fehler: Bitte geben Sie eine ungerade Zahl ein!");
            } else {
                // Muster erzeugen
                generiereMuster(zahl);
            }
        } while (true);

        scanner.close();
    }

    public static void generiereMuster(int n) {
        int mitte = (n + 1) / 2;

        // Oberer Teil des Musters
        for (int i = 1; i <= mitte; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Unterer Teil des Musters
        for (int i = mitte - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

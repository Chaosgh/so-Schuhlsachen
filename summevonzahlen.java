package easydatatype;

import java.util.Scanner;

public class summevonzahlen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gib den Startwert ein: ");
        int anfangszahl = input.nextInt();

        System.out.println("Bitte gib den Endwert ein: ");
        int endzahl = input.nextInt();

        int sum = 0;
        for (int i = anfangszahl; i <= endzahl; i++) { //solange die anfangszahl gr��er als endzahl ist wird hier geloopt
            sum += i;
        }

        System.out.println("Die Summe der Zahlen von " + anfangszahl + " bis " + endzahl + " betr�gt: " + sum);

        input.close();
    }
}

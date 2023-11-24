package easydatatype;

import java.util.Scanner;

public class fakultet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bitte gib den Startwert ein: ");
        int anfangszahl = input.nextInt();

        int factorial = 1;

        for (int i = anfangszahl; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("Die Fakultät von " + anfangszahl + " ist " + factorial);

        input.close();
    }

}

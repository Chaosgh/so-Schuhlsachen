package easydatatype;
import java.util.Scanner;

public class Zinsrechner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Eingabe der Laufzeit, des Grundbetrags und des Zinssatzes
        System.out.print("Laufzeit in Jahren: ");
        int laufzeit = input.nextInt();

        System.out.print("Grundbetrag: ");
        double grundbetrag = input.nextDouble();

        System.out.print("Zinssatz (in Prozent): ");
        double zinssatz = input.nextDouble();

        // Zinsen berechnen
        double zinsen = (grundbetrag * zinssatz / 100) * laufzeit;
        double gesamtwert = grundbetrag + zinsen;

        // Ausgabe der berechneten Zinsen und des Gesamtwerts
        System.out.println("Zinsen: " + zinsen);
        System.out.println("Gesamtwert: " + gesamtwert);
        
        
        input.close();
        
    }
}

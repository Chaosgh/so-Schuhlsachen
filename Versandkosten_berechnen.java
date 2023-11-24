package easydatatype;

import java.util.Scanner;

public class Versandkosten_berechnen {
	
	 public static void main(String[] args) { 
	        Scanner scanner = new Scanner(System.in);  //scanner wird erstellt
	        System.out.print("Geben Sie den Bestellwert in EUR ein: ");
	        double bestellwert = scanner.nextDouble();  //nächste scannereingabe wird zu bestellwert gesetzt
	        scanner.close();

	        double gesamtkosten = gesamtkostenBestellung(bestellwert);

	        System.out.printf("Gesamtkosten der Bestellung: %.2f EUR%n", gesamtkosten);
	    }
	 
    public static double gesamtkostenBestellung(double bestellwert) {
        double versandkosten = 0; //versandkosten sind anfangs 0

        if (bestellwert <= 200) { //wenn der bestellwert unter 200 ist
            versandkosten = 5.95; //versandkosten auf 5.95 gesetzt
        }

        double gesamtkosten = bestellwert + versandkosten;   // gesamt kosten werden gesetzt zu dem eingegebenen bestellwert und den gegebenen gesamtkosten
        return gesamtkosten;
    }

   
}

package easydatatype;


import java.util.Scanner;

public class BMIBerechnerErweitert {
    public static void main(String[] args) {
    	//neuer scanner wird erstellt
        Scanner input = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihr Gewicht in Kilogramm ein: ");
        //nächster input wird als gewicht definiert
        double gewicht = input.nextDouble();

        System.out.print("Bitte geben Sie Ihre Größe in Metern ein(Beispiel:1,69): ");
        //nächster input wird als größe definiert
        double groesse = input.nextDouble();
        	//bmi zahl wird ausgerechnet
        double bmi = gewicht / (groesse * groesse);

        System.out.printf("Ihr BMI beträgt: %.2f%n", bmi);
        //für bmi größen katekorien ausgesucht
        if (bmi < 16) {
            System.out.println("Kategorie: Magersucht");
        } else if (bmi >= 16 && bmi < 17) {
            System.out.println("Kategorie: Mäßiges Untergewicht");
        } else if (bmi >= 17 && bmi < 18.5) {
            System.out.println("Kategorie: Leichtes Untergewicht");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Kategorie: Normalgewicht");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Kategorie: Präadipositas (Übergewicht)");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("Kategorie: Adipositas Grad I (Übergewicht)");
        } else if (bmi >= 35 && bmi < 40) {
            System.out.println("Kategorie: Adipositas Grad II (Übergewicht)");
        } else {
            System.out.println("Kategorie: Adipositas Grad III (Übergewicht)");
        }

        input.close();
    }
}
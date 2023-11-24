package easydatatype;
import java.util.Scanner;
import java.lang.Math;

public class Sinusfunktion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Wert (in Grad) ein, für den Sie den Sinus berechnen möchten:");
        double grad = scanner.nextDouble();
        scanner.close();

        double bogenmaß = gradToRadians(grad); // Grad in Bogenmaß umrechnen
        double sinusWert = Math.sin(bogenmaß);

        System.out.println("Der Sinus von " + grad + " Grad ist: " + sinusWert);
    }

    // Methode zur Umrechnung von Grad in Bogenmaß
    public static double gradToRadians(double grad) {
        return Math.toRadians(grad);
    }

    // Methode zur Umrechnung von Bogenmaß in Grad
    public static double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }
}

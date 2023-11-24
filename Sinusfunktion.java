package easydatatype;
import java.util.Scanner;
import java.lang.Math;

public class Sinusfunktion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Wert (in Grad) ein, f�r den Sie den Sinus berechnen m�chten:");
        double grad = scanner.nextDouble();
        scanner.close();

        double bogenma� = gradToRadians(grad); // Grad in Bogenma� umrechnen
        double sinusWert = Math.sin(bogenma�);

        System.out.println("Der Sinus von " + grad + " Grad ist: " + sinusWert);
    }

    // Methode zur Umrechnung von Grad in Bogenma�
    public static double gradToRadians(double grad) {
        return Math.toRadians(grad);
    }

    // Methode zur Umrechnung von Bogenma� in Grad
    public static double radiansToDegrees(double radians) {
        return Math.toDegrees(radians);
    }
}

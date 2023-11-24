package easydatatype;
import java.util.Scanner;

public class Nullstellen_einer_quadratischen_Funktion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner wird erstellt
        
        System.out.print("Geben Sie den Wert f�r p ein: ");
        //n�chste eingabe als p definiert
        double p = scanner.nextDouble();
        System.out.print("Geben Sie den Wert f�r q ein: ");
        //n�chste eingabe als 1 definiert
        double q = scanner.nextDouble();
        
        double diskriminante = p * p - 4 * q;  //diskriminante wird ausgerechnet
        
        if (diskriminante > 0) { //wenn �ber 0 die diskriminante
            double x1 = (-p + Math.sqrt(diskriminante)) / 2;
            double x2 = (-p - Math.sqrt(diskriminante)) / 2;
            System.out.println("Es gibt zwei L�sungen:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (diskriminante == 0) {//wenn 0 die diskriminante
            double x1 = -p / 2;
            System.out.println("Es gibt eine doppelte L�sung:");
            System.out.println("x1 = " + x1);
        } else {
        	//f�r so paar f�lle indem es keine l�sung gibt
            System.out.println("Es gibt keine reale L�sung.");
        }
        
        scanner.close();
    }
}

package easydatatype;

import java.util.Scanner;

public class quersum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Zahl ein: ");
        int zahl = scanner.nextInt();
        
        int quersumme = berechneQuersumme(zahl);
        
        System.out.println("Die Quersumme von " + zahl + " ist: " + quersumme);
        scanner.close();
    }
    
    public static int berechneQuersumme(int zahl) {
        int quersumme = 0;
        while (zahl != 0) {
            quersumme += zahl % 10;
            zahl /= 10;
        }
        return quersumme;
    }
}

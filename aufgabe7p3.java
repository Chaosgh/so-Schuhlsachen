package easydatatype;

import java.util.Scanner;

public class aufgabe7p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        while (true) {
            System.out.print("Gib eine Zahl ein (0 zum Beenden): ");
            double num = scanner.nextDouble();
            sum += num;
            if (num == 0) {
                break;
            }
        }
        
        System.out.println("Die Summe der eingegebenen Zahlen ist: " + sum);
        scanner.close();
    }
}

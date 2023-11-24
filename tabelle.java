package easydatatype;

import java.util.Scanner;

public class tabelle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gebe 6 Zahlen ein");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        input.close();
        int aSquared = a * a;
        int bSquared = b * b;
        int cSquared = c * c;
        int dSquared = d * d;
        int eSquared = e * e;
        int fSquared = f * f;
      
        String[][] table = new String[7][];
        table[0] = new String[] {"Wert", "Quadrat"};
        table[1] = new String[] {a + "", aSquared + ""};
        table[2] = new String[] {b + "", bSquared + ""};
        table[3] = new String[] {c + "", cSquared + ""};
        table[4] = new String[] {d + "", dSquared + ""};
        table[5] = new String[] {e + "", eSquared + ""};
        table[6] = new String[] {f + "", fSquared + ""};

        for (String[] row : table) {
            System.out.format("%15s %15s %n", row);

        }
        
    }
}

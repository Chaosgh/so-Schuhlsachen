package easydatatype;

public class algo {

    // Methode zur Berechnung des ggT mit dem Euklidischen Algorithmus
    public static int berechneGGT(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Beispiel für die Verwendung der Methode
    public static void main(String[] args) {
        int zahl1 = 44;
        int zahl2 = 12;
        int ggT = berechneGGT(zahl1, zahl2);
        System.out.println("Der ggT von " + zahl1 + " und " + zahl2 + " ist: " + ggT);
    }
}

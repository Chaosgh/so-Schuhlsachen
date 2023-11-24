package easydatatype;


public class ueberpruefer {
    public static boolean checkklammer(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count == 0) {
                    return false;
                }
                count--;
            }
        }
        return count == 0;
    }

    public static void main(String[] args) {
        // Beispielaufrufe
        System.out.println(checkklammer("()")); // true
        System.out.println(checkklammer("(()(a)( ()((c))))")); // true
        System.out.println(checkklammer("(()")); // false
        System.out.println(checkklammer("a (()()) a)")); // false
        System.out.println(checkklammer(")blah(blubb)(")); // false
    }
}

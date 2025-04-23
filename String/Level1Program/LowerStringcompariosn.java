
import java.util.Scanner;

public class LowerStringcompariosn {

    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean areStringsEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complete text : ");
        String orginalText = scanner.nextLine();
        String lowerText = toLowerCase(orginalText);
        System.out.println("Lower case text: " + lowerText);
        boolean isEqual = areStringsEqual(orginalText, lowerText);
        System.out.println("Are the original and lower case strings equal? " + isEqual);

    }
}

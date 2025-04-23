
import java.util.Scanner;

public class StringCompersion {

    public static Boolean isEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }

            // return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = scanner.next();
        System.out.println("Enter second string : ");
        String s2 = scanner.next();
        System.out.println("Are the strings equal? " + isEqual(s1, s2));
    }

}

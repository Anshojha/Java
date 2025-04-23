import  java.util.Scanner;



public class SubStringComp {
    public static String createSubstring (String str, int start , int end) {
        String result = "";
        for( int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean  isEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String s1 = scanner.next();
        System.out.println("Enter second string: ");
        String s2 = scanner.next();
        System.out.println("Enter start index: ");
        int start = scanner.nextInt();
        System.out.println("Enter end index: ");
        int end = scanner.nextInt();
        String subString = createSubstring(s1, start, end);
        System.out.println("SubString: " + subString);
        System.out.println("Are the strings equal? " + isEqual(subString, s2));
        System.out.println("Are the strings equal? " + isEqual(s1, s2));
    }
}


import java.util.Scanner;


public class StringCharArrayComprisson {
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    // Method to compare two character arrays
    public static boolean areArraysEqual(char[] a1, char[] a2) {
        if (a1.length != a2.length) {
            return false;
        }
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  string: " );
        String text = scanner.next();
         // Use user-defined method
         char[] userDefinedChars = getChars(text);

         // Use built-in toCharArray()
         char[] builtInChars = text.toCharArray();

         boolean areEqual = areArraysEqual(userDefinedChars, builtInChars);
         System.out.print("\nUser-defined char array: ");
         for (char c : userDefinedChars) {
             System.out.print(c + " ");
         }
 
         System.out.print("\nBuilt-in toCharArray(): ");
         for (char c : builtInChars) {
             System.out.print(c + " ");
         }
            System.out.println("\nAre the character arrays equal? " + areEqual); 
    }
}

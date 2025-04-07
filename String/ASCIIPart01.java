
public class ASCIIPart01 {

    public static int[][] findASCIIValues(String text) {
        int[][] charASCIIValues = new int[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            charASCIIValues[i][0] = text.charAt(i);
            charASCIIValues[i][1] = text.charAt(i);
        }

        return charASCIIValues;

    }

    public static void displayASCIIValues(String text, int[][] charASCIIValues) {
        System.out.println("Characters and their corresponding ASCII values "
                + "for " + text + " is:");
        for (int i = 0; i < charASCIIValues.length; i++) {
            System.out.println((char) charASCIIValues[i][0] + "-"
                    + charASCIIValues[i][1]);
        }

    }

    public static void main(String[] args) {
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+[]{}|;':\",.<>?`~";
        int[][] charASCIIValues = findASCIIValues(text.trim());
        displayASCIIValues(text, charASCIIValues);
    }
}

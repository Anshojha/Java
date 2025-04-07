public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "   Hello Java!   ";

        // trim(): remove leading and trailing spaces
        String trimmed = text.trim();
        System.out.println("trim(): \"" + trimmed + "\"");

        // length(): get length of the string
        System.out.println("length(): " + trimmed.length());

        // charAt(): get character at index 1
        System.out.println("charAt(1): " + trimmed.charAt(1));

        // concat(): join two strings
        String greeting = "Welcome ";
        String fullGreeting = greeting.concat(trimmed);
        System.out.println("concat(): " + fullGreeting);

        // equals(): compare strings
        System.out.println("equals(\"Hello Java!\"): " + trimmed.equals("Hello Java!"));

        // toCharArray(): convert string to char array
        char[] chars = trimmed.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // substring(): get substring from index 6 to 10
        System.out.println("substring(6, 10): " + trimmed.substring(6, 10));

        // toLowerCase(): convert to lower case
        System.out.println("toLowerCase(): " + trimmed.toLowerCase());

        // toUpperCase(): convert to upper case
        System.out.println("toUpperCase(): " + trimmed.toUpperCase());
    }
}

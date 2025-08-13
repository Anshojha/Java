import java.io.IOException;

public class ThrowsKeywordExample {
    public static void main(String[] args) {
        try {
            readFile("nonexixtenceFile.txt");
        } catch (IOexception e) {
           System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("Rest of the code executes...");

    }
    public static void readFile(String fileName) throws IOException {
        if (!fileName.equals("validfile.txt")) {
            // Throwing an IOException using `throw` keyword
            throw new IOException("File not found");
        }
        System.out.println("File read successfully");
    }

}

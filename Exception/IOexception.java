
import java.io.File;
// import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class IOexception {
    public static void main(String[] args) {
        try {
            // Attempt to open a file that may not exist
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
            
            // Read the file line by line
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            // This block catches and handles the specific FileNotFoundException
            System.err.println("FileNotFoundException => " + e.getMessage());
        } catch (Exception e) {
            // This is a generic catch block for any other unexpected exceptions
            System.err.println("Generic Exception => " + e.getMessage());
        }
}}

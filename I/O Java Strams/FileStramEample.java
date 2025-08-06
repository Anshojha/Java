
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class FileStramEample {
    public static void main(String[] args) {
        // This is a placeholder for the main method in FileStramEample.java
        System.out.println("This is a placeholder for FileStramEample.java");
        try (FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt")) {
            int byteData;
            while((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            System.out.println("");
        } catch (IOException e) { 
        }
    }
}

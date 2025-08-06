
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderWriterExample {
    public static void main(String[] args) {
        try ( Reader reader = new InputStreamReader (new FileInputStream("input.txt"));
              java.io.Writer writer = new java.io.OutputStreamWriter(new java.io.FileOutputStream("output12122112.txt"))
        ) {
            int charData;
            while ((charData = reader.read()) != -1) {
                writer.write(charData);
            }
            System.out.println("File copied successfully using Reader and Writer.");
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

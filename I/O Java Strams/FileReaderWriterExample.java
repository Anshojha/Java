
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriterExample {
    public static void main(String[] args) {
        try (FileReader fr  = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output1.txt")
        ) {
            int byteData;
            while((byteData = fr.read()) != -1) {
                fw.write(byteData);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}


import java.io.*;





public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output1212.txt"));
        ) {
            String line;
            while ((line = br.readLine()) != null ) {
                bw.write(line);
                 bw.newLine();
            }
            System.out.println("File copied successfully with buffering.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;

public class GenerateLargeFile {
    public static void main(String[] args) {
        String fileName = "largeFile.txt";
        long lines = 50_000_000; // ~500MB of text (adjust if needed)

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (long i = 0; i < lines; i++) {
                writer.write("This is line number " + i + " for Buffered vs Unbuffered performance test.\n");
            }
            System.out.println("largeFile.txt created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

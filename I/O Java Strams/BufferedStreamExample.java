
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamExample {
    public static void main(String[] args) {
        try (
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
            BufferedOutputStream bas = new BufferedOutputStream(new FileOutputStream( "output12.txt"))
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bas.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied successfully with buffering.");
        } catch (Exception e) {
             e.printStackTrace();

        }
    }
}

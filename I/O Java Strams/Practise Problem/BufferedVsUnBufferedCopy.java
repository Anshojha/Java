
import java.io.*;

public class BufferedVsUnBufferedCopy {

    private static final int BUFFER_SIZE = 4096; // 4KB buffer size

    public static void main(String[] args) {
        String sourcePath = "largeFile.txt";

        String destUnbuffered = "copy_unbuffered.txt";
        String destBuffered = "copy_buffered.txt";
        long startUnBuffered = System.nanoTime();
        copyUsingUnbufferedStreams(sourcePath, destUnbuffered);
        long endUnBuffered = System.nanoTime();
        System.out.println("Unbuffered copy time: " + (endUnBuffered - startUnBuffered) / 1_000_000 + " ms");
        long startBuffered = System.nanoTime();
        copyUsingBufferedStreams(sourcePath, destBuffered);
        long endBuffered = System.nanoTime();
        System.out.println("Buffered copy time: " + (endBuffered - startBuffered) / 1_000_000 + " ms");
    }

    public static void copyUsingUnbufferedStreams(String sourcePath, String destPath) {
        try (
                FileInputStream fis = new FileInputStream(sourcePath); FileOutputStream fos = new FileOutputStream(destPath);) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Unbuffered copy failed:");
            e.printStackTrace();
        }
    }

    public static void copyUsingBufferedStreams(String sourcePath, String destinationPath) {
        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath)); BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationPath));) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            System.out.println("Buffered copy failed:");
            e.printStackTrace();

        }
    }

}

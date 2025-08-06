
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;



public class ByteArrayStreamExampl {
    public static void main(String[] args) {
        String data = "This is a test string for ByteArrayStream.";
        byte[] byteArray = data.getBytes();

        try (
            ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            int byteData;
            while((byteData = bais.read()) != -1) {
                baos.write(Character.toUpperCase((char) byteData));
            }
            System.out.println("Original: " + data);
            System.out.println("Modified: " + baos.toString());
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

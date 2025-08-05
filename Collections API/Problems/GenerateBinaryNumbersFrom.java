
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class GenerateBinaryNumbersFrom {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of binary numbers to generate: ");
        n = scanner.nextInt();
        generateBinaryNumberss(n);
        scanner.close();
    }

    public static void generateBinaryNumberss(int n) {
        Queue<String> queue  = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < n; i++) {
            String binaray = queue.remove();
            System.out.println(binaray + " ");

            queue.add(binaray + "0");
            queue.add(binaray + "1");
            
        }
    }
}


import java.util.Arrays;



public class FillArray {
    public static void main(String[] args) {
        char arr[] = {'a', 'e', 'i', 'o', 'u'};
        int startIndex = 1;
        int endIndex = 4;
        Arrays.fill(arr, startIndex, endIndex, 'x');
        System.out.println(Arrays.toString(arr));
    }
}

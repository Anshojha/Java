import java.lang.reflect.Array;
import  java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        char vowels[] = new char[7];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = '0';
        vowels[4] = 'u';

        char vowels2[] = {'a', 'o', 'u', 'e', 'i'};        
            System.out.println(Arrays.toString(vowels));
            System.out.println(Arrays.toString(vowels2));
            vowels2[3] = 'c';
            
            System.out.println(Arrays.toString(vowels2));
            System.out.println(vowels2.length);  // to print the length of the array
            Arrays.sort(vowels2);
            int startIndex = 1;
            int endIndex = 4;

            Arrays.sort(vowels, startIndex , endIndex);
            System.out.println(Arrays.toString(vowels));
            char key = 'a';
            int foundIndex = Arrays.binarySearch(vowels2, key);
            System.out.println(foundIndex);
            

    }
}

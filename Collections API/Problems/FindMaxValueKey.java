
import java.util.*;

public class FindMaxValueKey {
    public static String findMaxValueKey(Map<String, Integer> map) {
        
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
            "apple", 5,
            "banana", 3,
            "orange", 8,
            "grape", 10
        );

        String maxKey = findMaxValueKey(map);
        System.out.println("Key with maximum value: " + maxKey);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> freMap = new HashMap<>();
        for(String str : list) {
            freMap.put(str, freMap.getOrDefault(str, 0)+1);
        }
        return freMap;
    }
    
    public static void main(String[] args) {
        List <String> list = List.of("apple", "banana", "apple", "orange");
        System.out.println("Original List: " + list);
        Map<String , Integer> frequencyMap = countFrequency(list);
        System.out.println("Frequency Map: " + frequencyMap);
    }
}

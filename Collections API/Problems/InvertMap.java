
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvertMap {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();
        for (Map.Entry<K,V> entry : inputMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            
            if(invertedMap.containsKey(value)) {
                invertedMap.get(value).add(key);
            }
            else {
                List<K> keys = new ArrayList<>();
                keys.add(key);
                invertedMap.put(value, keys);
            }
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("apple", 1);
        input.put("banana", 2);
        input.put("orange", 3);
        input.put("orange", 2);
        System.out.println("Original Map: " + input);
        Map<Integer, List<String>> inverted = invertMap(input);
        System.out.println("Inverted Map: " + inverted);
    }

}


import java.util.HashMap;
import java.util.Map;

public class MergeMaps {
    Map<String, Integer> mergeMaps (Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if(result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            }
            else {
                result.put(key, value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("apple", 2, "banana", 3);
        Map<String, Integer> map2 = Map.of("banana", 1, "orange", 4);

        MergeMaps merger = new MergeMaps();
        Map<String, Integer> mergedMap = merger.mergeMaps(map1, map2);

        System.out.println("Merged Map: " + mergedMap);
    }
}

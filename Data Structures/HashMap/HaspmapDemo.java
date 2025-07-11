
import java.util.*;

public class HaspmapDemo {

    public static void main(String[] args) {
        // 1. Create a HashMap to store fruit names and their corresponding quantities
        HashMap<String, Integer> fruitMap = new HashMap<>();

        // 2. Add some key-value pairs to the HashMap
        fruitMap.put("Apple", 1);
        fruitMap.put("Banana", 2);
        fruitMap.put("Orange", 3);
        fruitMap.put("Mango", 4);

        // 3. Demonstrate basic operations on the HashMap
        System.out.println("Initial Map: " + fruitMap);


        // 4. Perform operations like updating, retrieving, checking existence, and removing elements
        fruitMap.put("Apple", 5); // Update value for key "Apple"
        System.out.println("After updating Apple: " + fruitMap);

        System.out.println("Value for key 'Banana': " + fruitMap.get("Banana")); // Retrieve value for key "Banana"
        System.out.println("Does the map contain key 'Orange'? " + fruitMap.containsKey("Orange")); // Check if key exists
        System.out.println("Does the map contain value 3? " + fruitMap.containsValue(3)); // Check if value exists

        fruitMap.remove("Mango"); // Remove key-value pair for key "Mango"
        System.out.println("After removing Mango: " + fruitMap);

        // 5. Iterate over the HashMap using for-each loop
        System.out.println("Iterating over the map:");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.err.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        } 

        // 6. Word frequency count
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.err.println("------------- Word Frequency Count -------------");
        for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: "+ entry.getKey() + ", Frequency: " + entry.getValue());
        }

        // 8. Null Handling
        fruitMap.put("null", 456); // One null key allowed
        fruitMap.put("104", null);      // Multiple null values allowed
        fruitMap.put("105", null);

        System.out.println("After adding null key and values: " + fruitMap);

         // 10. LinkedHashMap maintains insertion order
        System.out.println("\n--- LinkedHashMap (Order Preserved) ---");
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "One");
        linkedMap.put(2, "Two");
        linkedMap.put(3, "Three");
        System.out.println(linkedMap);

        // 11. Thread-safe version
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(new HashMap<>());
        synchronizedMap.put(1, "Thread Safe");

        System.out.println("\n--- Synchronized Map ---");
        System.out.println(synchronizedMap);
    }

}

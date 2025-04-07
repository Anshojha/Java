
import java.util.HashMap;
import java.util.Map;

public class HashMethods {
    public static void main(String[] args) {
        // 1️⃣ Ininitialzing / Creating a hashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2️⃣ put() - Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        // 3️⃣ get() - Retrieving a value
        System.out.println("Value at key 2: " + map.get(2));  // Output: Banana

        // 4️⃣ remove() - Removing a key-value pair
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        // 5️⃣ containsKey() - Checking if a key exists
        System.out.println("Contains key 1? " + map.containsKey(1));  // true

        // 6️⃣ containsValue() - Checking if a value exists
        System.out.println("Contain value 'mango' ? "+ map.containsValue("Mango"));

        // 7️⃣ size() - Getting the number of key-value pairs
        System.out.println("Size of the map is : " + map.size()); // 3

        // 8️⃣ keySet() - Getting all keys
        System.out.println("Keys : " + map.keySet());

        // 9️⃣ values() - Getting all values
        System.out.println("Values :" + map.values());

         // 🔟 entrySet() - Getting all key-value pairs
        for(Map.Entry<Integer , String > entry : map.entrySet()) {
        System.out.println("Key :" + entry.getKey() + ", Value :" + entry.getValue());
        }

        // 1️⃣3️⃣ forEach() - to iterate all over the elements of the array
        
        map.forEach((num , fruit) -> {
            System.out.println(num + " - " + fruit);
        });

        
        // 1️⃣1️⃣ clear() - Removing all entries
        map.clear();
        System.out.println("HashMap after clear(): " + map);

        // 1️⃣2️⃣ isEmpty() - Checking if the HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());  // 
        
       
    }
}

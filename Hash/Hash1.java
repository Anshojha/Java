
import java.util.HashMap;
import java.util.Map;



public class Hash1 {
    public static void main(String[] args) {
        HashMap<String, Integer> dict = new HashMap<String, Integer>(); // Initialization

        dict.put("Maong", 3);
        dict.put("Potato", 4);
        dict.put("Tomato", 7);
        dict.put("Banana", 12);

        System.out.println(dict.toString());

        System.out.println(dict.get("Banana"));

        dict.remove("Potato");

        for(String key : dict.keySet()) {
            System.out.println("Key :" + key + ",  Value :" + dict.get(key) );
        }
    }
}

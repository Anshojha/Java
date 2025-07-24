
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Ansh");
        map.put(2, "Ansh2");
        map.put(5, "Ansh3");
        map.put(4, "Ansh4");
        map.put(3, "Ansh5");

        System.out.println(map);


        for(Integer v : map.keySet()) {
            System.out.println(v +" " + map.get(v));
        }

    }
}

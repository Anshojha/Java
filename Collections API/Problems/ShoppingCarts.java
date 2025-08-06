import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;





class ShoppingCart {
    private HashMap<String, Double> productPriceMap = new HashMap<>();
    private LinkedHashMap<String, Double> cartOrderMap = new LinkedHashMap<>();

    public void addProduct(String productName, double  price) {
        productPriceMap.put(productName, price);
        cartOrderMap.put(productName, price); // Initialize with 0 quantity
    }

    public void dispayCartOrder() {
        for(Map.Entry<String, Double> entry : cartOrderMap.entrySet()) {
            String productName = entry.getKey();
            double price = entry.getValue();
            System.out.println("Product: " + productName + ", Price: " + price);
        }
    }

    public void displayCartSortedByProductName() {
        TreeMap<String, Double> sortedProducts = new TreeMap<>(productPriceMap);
        for (Map.Entry<String, Double> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    public void displayCartSortedByPrice() {
        List<Map.Entry<String, Double>> list = new ArrayList<>(productPriceMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Double> entry : list) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

}

public class ShoppingCarts {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 0.99);
        cart.addProduct("Banana", 0.59);
        cart.addProduct("Orange", 0.79);

        System.out.println("Cart Order:");
        cart.dispayCartOrder();

        System.out.println("\nCart Sorted by Product Name:");
        cart.displayCartSortedByProductName();

        System.out.println("\nCart Sorted by Price:");
        cart.displayCartSortedByPrice();
    }
}

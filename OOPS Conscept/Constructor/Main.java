class CoffeeShopOrder {
    // Attributes
    String customerName;
    String coffeeType;
    int quantity;
    double totalPrice;


     // Default Constructor
    CoffeeShopOrder() {
        customerName = "Guest";
        coffeeType = "Regular";
        quantity = 1;
        totalPrice = calculatePrice();
    }

    // Parameterized Constructor
    CoffeeShopOrder(String customerName, String coffeeType, int quantity) {
        this.customerName = customerName;
        this.coffeeType = coffeeType;
        this.quantity = quantity;
        this.totalPrice = calculatePrice();
    }

    // Copy Constructor
    CoffeeShopOrder(CoffeeShopOrder previousOrder) {
        this.customerName = previousOrder.customerName;
        this.coffeeType = previousOrder.coffeeType;
        this.quantity = previousOrder.quantity;
        this.totalPrice = previousOrder.totalPrice;
    }

    // Method to calculate total price based on coffee type and quantity
    private double calculatePrice() {
        double pricePerCup = 0.0;
        switch (coffeeType.toLowerCase()) {
            case "espresso":
                pricePerCup = 2.50;
                break;
            case "latte":
                pricePerCup = 3.00;
                break;
            case "cappuccino":
                pricePerCup = 3.50;
                break;
            default:
                pricePerCup = 2.00; // Regular coffee
        }
        return pricePerCup * quantity;
    }

    void displayOrderDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Coffee Type: " + coffeeType);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("------------------------------");
    }
 }


 public class Main {
    public static void main(String[] args) {
        // Creating an order using the default constructor
        CoffeeShopOrder order1 = new CoffeeShopOrder();
        order1.displayOrderDetails();

        // Creating an order using the parameterized constructor
        CoffeeShopOrder order2 = new CoffeeShopOrder("Alice", "Latte", 3);
        order2.displayOrderDetails();

        // Creating a copy of an existing order using the copy constructor
        CoffeeShopOrder order3 = new CoffeeShopOrder(order2);
        order3.displayOrderDetails();
    }
 }
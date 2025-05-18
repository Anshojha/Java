
class Product {
    private static double discount = 10.0;
    private final int productId;
    private String productName;
    private double price;
    private int quantity;



    Product (int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }


    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProductInfo() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }


 }

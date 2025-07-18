class Mobile {
    String brand;
    int price;
    // Static Variable
    static String name;

    
    // Constructor
    
    public Mobile () {
        brand = "";
        price = 200;
        System.out.println("I am in cosnstuctor !!");
    }
    // Static block is used when we have to intialize the static variable only once
    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile(int price) {
        this.price = price;
    }

    public void show () {
        System.out.println(brand + ":" + price + ":" + name);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        
        try {
            Class.forName("Mobile"); // This will load the class 
            // Mobile obj1 = new Mobile();
            // obj1.brand = "Apple";
            // obj1.price = 23432;
            // Mobile.name = "SmartPhone";
            // obj1.show();
        } catch (ClassNotFoundException ex) {
            
        }
    }
}
// In this example, the static method `square` is defined in the `MathUtility` class. It can be called directly using the class name without creating an instance of the class. The output will be "Square of 5 is: 25".
enum Laptop {
    MACBOOK(400), XPS(3400), DELL(3200);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Demo3 {
    public static void main(String[] args) {
        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : $" + l.getPrice());
        }
    }
}

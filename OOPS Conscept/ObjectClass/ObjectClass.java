


class Laptop {

    String brand;
    int price;

    public String toString() {

        return ("Model : " + brand + " Price : " + price);
    }
}

public class ObjectClass {

    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.brand = "JO";
        obj.price = 10000000;

        System.out.println(obj.toString());

        Laptop obj2 = new Laptop();
        obj2.brand = "JO";
        obj2.price = 10000000;

         System.out.println(obj.toString());

         System.out.println("Comparig this two objects ");

         boolean result = obj == obj2;
         System.err.println(result);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}

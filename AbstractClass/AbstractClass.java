

abstract class Car {
    public abstract void drvie();
    public abstract void fly();
    public void playMusic () {
        System.out.println("Playing music........");
    }
}

class WagonR extends Car {
    public void fly() {
        System.out.println("My car can fly.........");
    };
    public void drvie () {
        
        System.out.println("I am driing");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.drvie();
    }
}

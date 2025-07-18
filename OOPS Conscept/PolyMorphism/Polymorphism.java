class A {
    public void show() {
        System.out.println("I am from show A");
    }
}


class B extends  A {
    public void show() {
        System.out.println("I am from show B");
    }


}
public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("Before changing refrence at runtime.");
        obj.show();
        obj = new B();
         System.out.println("After changing refrence at runtime.");
        obj.show();

    }
}

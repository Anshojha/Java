
interface A {
    // In interface the variales are already final and static show can't be inintalozed normally 
    // In interface we don't need to add the public abstract before methods as they are already hidden
    void show();

    void config();

}

class B implements A {

    public void show() {
        System.out.println("In shwo");
    }

    public void config() {
        System.out.println("In config");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        A obj;
        // obj = new A();    It cannot be instantiated
        obj = new B();
        obj.show();
        obj.config();
    }
}

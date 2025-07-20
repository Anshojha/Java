
@FunctionalInterface  
interface A {
    void show();
    // void show2(); Show error when wewdefin a one more methods
}

class B implements  A {
    public void show () {
        System.out.println("In show");
    }
}

public class FunctiononalInterface{
        public static void main(String[] args) {
            A obj = new B();
            obj.show();

        }
}

class A {
    public void show () {
        System.out.println("This is A show");
    }
}

public class AnonymusClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println("This is AnonymusShow");
            }
        };
           obj.show(); // This is AnonymusShow
    }
 
}



class Ab {
    public void show () {
        System.out.println("In show methods");
    }

 static class B {
        public void config () {
            System.out.println("I am in Config!!");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        Ab obj = new Ab();
        obj.show();
        // B obj1 = new B(); It throw error because it is in class Ab
        // Ab obj1 = new B(); This also thrwo an  error if 
        // Ab.B obj1 = new B();  Sane error 
        // Ab.B obj1 = new Ab.B();  Inner class is not static
        Ab.B obj1 = new Ab.B(); // After declearing the inner class static
        obj1.config();
    }
}
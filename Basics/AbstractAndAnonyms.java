abstract  class  A{
    public abstract void show ();
}

class B extends  A {
   public void show() {
    System.out.println("In B show !!");
   }
}


public class AbstractAndAnonyms {
   public static void main(String[] args) {
        A obj = new B() {
            public void show () {
                System.out.println("Print the ");
            }
        };
        obj.show();
   }
}

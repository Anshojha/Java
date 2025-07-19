  
@Deprecated // To show that my be in future no longer in use
class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("From A");
    }
}


class B extends A {
    @Override  // This are the annotations 
     public void showTheDataWhichBelongsToThisClass(){
        System.out.println("From B");
    }
}
public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass(); 
    }
}

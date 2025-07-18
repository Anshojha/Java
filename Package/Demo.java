import othre.*;
import othre.tools.*;

public class Demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println("Add: " + obj.add(10, 5));
        System.out.println("Sub: " + obj.sub(10, 5));

        AdvCalc adv = new AdvCalc();
        System.out.println("Mult: " + adv.mult(10, 5));
        System.out.println("Div: " + adv.div(10, 5));

        A obj2 = new A();
        System.out.println("Mark: " + obj2.mark);
        obj2.show();

        obj2 = new B();
        obj2.show();
    }
}

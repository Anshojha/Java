
class Parent {
    final void display() {
        System.out.println("Final Method");
    }
}

class Child extends Parent {
    // Cannot override display()
}

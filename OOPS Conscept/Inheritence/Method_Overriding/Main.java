

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    
    void sound(){
        System.out.println("Dog barks loudly");
    }
}


public  class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Anima refers to Animal object
        Dog myDog = new Dog(); // Dog refers to the dog object
        myAnimal.sound(); // Calls the method in Animal class
        myDog.sound(); // Calls the overridden method in Dog class
    }
}
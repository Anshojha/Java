class Animal {
    public String name = "Animal";
    protected int age = 5;
    private String spcies = "Unknown";

    public Animal() {
        System.out.println("Animal Constructor");
    }


    void eat()
    {
        System.out.println("Animal is eating");
    }

    void sound() {
        System.out.println("Animal make sound");
    }

    //Getter for private field
    public String getSpecies() {
        return spcies;
    }
}


// Subclass - Single Inheritance

class Dog extends Animal {
    Dog() {
        super();
        System.out.println("Dog Constructor");
    }

    void bark() {
        System.out.println("Dog is barking");
    }

    @Override
    void sound() {
        System.out.println( "Dog barks");
    }


    void prindtDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + getSpecies());
        // System.out.println("Species: " + spcies); // Error: spcies has private access in Animal
    }
}

// Subclass - Multilevel Inheritance

class Puppy extends Dog {
    Puppy() {
        // super();
        System.out.println("Puppy Constructor");
    }

    void whimper() {
        System.out.println("Puppy is whimpering");
    }

    @Override
    void sound() {
        System.out.println( "Puppy whimpers");
    }
}

// Another subclass of Animal - Hierarchical Inheritance
class Cat extends Animal {
    Cat() {
        super();
        System.out.println("Cat Constructor");
    }

    void meow() {
        System.out.println("Cat is meowing");
    }

    @Override
    void sound() {
        System.out.println( "Cat meows");
    }

    void prindtDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + getSpecies());
        // System.out.println("Species: " + spcies); // Error: spcies has private access in Animal
    }
}   


public class Main {
    public static void main(String[] args) {
        System.out.println("====================Single Inheritance===================");
        Dog dog = new Dog();
        dog.eat();
        dog.sound();
        dog.bark();
        dog.prindtDetails();
        System.out.println("====================Multilevel Inheritance===================");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.sound();
        puppy.bark();
        puppy.whimper();
        puppy.prindtDetails();
        System.out.println("====================Hierarchail Inheritence===================");
        Cat cat = new Cat();
        cat.eat();
        cat.sound();
        cat.meow();
        cat.prindtDetails();
        System.out.println("====================Polymorphic behavior===================");
        Animal a1 = new Dog();
        Animal a2 = new Puppy();
        Animal a3 = new Cat();


        a1.sound(); // Dog barks
        a2.sound(); // Puppy whimpers   
        a3.sound(); // Cat meows

    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}

public class ObjectStreamExample {

    public static void main(String[] args) {
        Person person = new Person("Huda", 30);

        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));) {
            oos.writeObject(person);
            System.out.println("Object serialized successfully.");
        } catch (Exception e) {
             e.printStackTrace();
        }

        try (
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))
        ) {
            Person desirializedPerson = (Person) ois.readObject();
            System.out.println("Deserialized Object: " + desirializedPerson);
        } catch (IOException| ClassNotFoundException e) {
             e.printStackTrace();
    }
}
}

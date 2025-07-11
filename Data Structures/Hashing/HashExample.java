import java.util.Objects;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); // Uses Java's utility to combine hashes
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id && Objects.equals(this.name, e.name);
    }
}
public class HashExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice");
        Employee emp2 = new Employee(2, "Bob");
        Employee emp3 = new Employee(1, "Alice"); // Same id and name as emp1

        System.out.println("emp1 hashCode: " + emp1.hashCode());
        System.out.println("emp2 hashCode: " + emp2.hashCode());
        System.out.println("emp3 hashCode: " + emp3.hashCode());

        System.out.println("emp1 equals emp2: " + emp1.equals(emp2));
        System.out.println("emp1 equals emp3: " + emp1.equals(emp3));
    }
}
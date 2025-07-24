
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age  = " + age + ", name = " + name + "]";
    }

}

public class ComparatorDemo2 {

    public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> studList = new ArrayList<>();

        studList.add(new Student(12, "Ansh"));
        studList.add(new Student(34, "Navin"));
        studList.add(new Student(38, "Wangdu"));
        studList.add(new Student(19, "Avdesh"));

        System.out.println("Student List without sorting ->>");

        for (Student s : studList) {
            System.out.println(s);
        }

        Collections.sort(studList, com);

        System.out.println("Student List after sorting ->>");
        for (Student s : studList) {
            System.out.println(s);
        }
    }
}

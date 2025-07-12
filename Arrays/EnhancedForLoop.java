


class Student {
    int rollNo;
    String name;
    int marks;
}
public class EnhancedForLoop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 12;
        s1.name = "Raj";
        s1.marks = 00;
        Student S2 = new Student();
        S2.rollNo = 123;
        S2.name = "RajJ";
        S2.marks = 000;
        Student S3 = new Student();
        S3.rollNo = 12;
        S3.name = "Raj";
        S3.marks = 00;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = S2;
        students[2] = S3;
        System.err.println("Name      Roll no      Marks");
        for(Student stud : students) {
            System.out.println(stud.name + "           " + stud.rollNo + "       " + stud.marks );
        }

    }
}

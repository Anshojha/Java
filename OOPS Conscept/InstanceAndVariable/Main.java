class School {
    String studentName;
    static  int totalStudents;


    // constructir 
    School(String studentName) {
        this.studentName = studentName;
        totalStudents++;
    }

    // instance method 
    void displayStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("------------------------------");
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        School student1 = new School("Alice");
        School student2 = new School("Bob");
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        School.displayTotalStudents();
    }
}

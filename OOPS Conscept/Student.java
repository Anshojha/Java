public class Student {  // Ensure class name matches the file name
    public int rollno;
    public String name;
    public float marks;

    // Constructor to initialize student details
    public Student(int rollno, String name, float marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    // Constructor overLoading 
    public Student() {
        this.rollno = 0;
        this.name = "Unknown";
        this.marks = 0.0f;
    }
    // Method to change the name of the student
    // This method is used to change the name of the student
    // It takes a String parameter 'newName' and assigns it to the 'name' attribute of the student object.
     Student (Student s) {
        this.rollno = s.rollno;
        this.name = s.name;
        this.marks = s.marks;
    }


    void chanegeName(String newName) {
        this.name = newName;
    }
}

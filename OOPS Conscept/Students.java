public class Students {
    public static void main(String[] args) {
        // Create a Student object using the constructor
        Student[] s1 = new Student[5];
        // s1.rollno = 101;
        // s1.name = "John Doe";
        // s1.marks = 85.5f;
        // // s1 = new Student(101, "John Doe", 85.5f); // Uncomment if constructor is used

        // Print details
        // System.out.println("Roll No: " + s1.rollno);
        // System.out.println("Name: " + s1.name);
        // System.out.println("Marks: " + s1.marks);
        // Create an array of Student objects
        s1[0] = new Student();
        s1[0].rollno = 101;
        s1[0].name = "John Doe";
        s1[0].marks = 85.5f;
        s1[1] = new Student();
        s1[1].rollno = 102;
        s1[1].name = "Jane Smith";
        s1[1].marks = 90.0f;
        s1[2] = new Student();
        s1[2].rollno = 103;
        s1[2].name = "Alice Johnson";
        s1[2].marks = 78.5f;
        s1[3] = new Student();
        s1[3].rollno = 104;
        s1[3].name = "Bob Brown";
        s1[3].marks = 92.0f;
        s1[4] = new Student();
        s1[4].rollno = 105;
        s1[4].name = "Charlie White";
        s1[4].marks = 88.0f;
        // Print details of each student
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Roll No: " + s1[i].rollno);
            System.out.println("Name: " + s1[i].name);
            System.out.println("Marks: " + s1[i].marks);
            System.out.println();
        }

        System.out.println("Changing name of student 1...");
        // Change the name of the first student
        s1[0].chanegeName("John Smith");
        // Print updated details of the first student   
        System.out.println("Updated Name: " + s1[0].name);

    }
}

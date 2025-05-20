import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Course> courses;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
        // ✅ Use getter method instead of accessing private variable
        System.out.println("Course " + course.getCourseName() + " has been added to " + schoolName);
    }

    public void showCourses() {
        System.out.println("Courses offered by " + schoolName + ":");
        for (Course course : courses) {
            // ✅ Use getter method instead of accessing private variable
            System.out.println("- " + course.getCourseName() + " (Instructor: " + course.getInstructor().getName() + ")");
        }
    }
}

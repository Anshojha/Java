
import java.util.Scanner;



class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }

}


class Manager extends Employee {
    String department;

    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    String university;

    Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }
}

public class Q1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Manager's Name: ");
        String mName = sc.nextLine();
        System.out.println("Enter Manager's ID: ");
        int mId = sc.nextInt();
        System.out.println("Enter Manager's Salary: ");
        double mSalary = sc.nextDouble();
        System.out.println("Enter Manager's Department: ");
        String mDepartment = sc.nextLine();
        sc.nextLine(); // Consume newline


        System.out.println("Enter Developer's Name: ");
        String dName = sc.nextLine();
        System.out.println("Enter Developer's ID: ");
        int dId = sc.nextInt();
        System.out.println("Enter Developer's Salary: ");
        double dSalary = sc.nextDouble();
        System.out.println("Enter Developer's university name : ");
        String dUniversity = sc.nextLine();
        sc.nextLine(); // Consume newline

        System.out.println("Enter Intern's name: ");
        String iName = sc.nextLine();
        System.out.println("Enter Intern's ID: ");
        int iId = sc.nextInt();
        System.out.println("Enter Intern's Salary: ");
        double iSalary = sc.nextDouble();
        System.out.println("Enter Intern's university name: ");
        String iUniversity = sc.nextLine();
        sc.nextLine(); // Consume newline

        System.out.println("\nManager Details:");
        Manager manager = new Manager(mName, mId, mSalary, mDepartment);
        manager.displayDetails();
        System.out.println("\nDeveloper Details:");
        Developer developer = new Developer(dName, dId, dSalary, dUniversity);
        developer.displayDetails();
        System.out.println("\nIntern Details:");
        Intern intern = new Intern(iName, iId, iSalary, iUniversity);
        intern.displayDetails();
        sc.close();
        System.out.println("End of program.");

    }
}
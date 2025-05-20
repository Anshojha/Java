import java.util.ArrayList;

class Employee {
    String name;

    public Employee(String name) { 
        this.name = name;
    }

    void dispalay() {
        System.out.println("Employee : " + name);
    }
    
}

class Department {
    String departmentName;
    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }

    void dispalayAllEmployee() {
        System.err.println("Department : " + departmentName);
        for (Employee e : employees) {
            e.dispalay();
        }
    }

}


class Company {
    String companyName;
    ArrayList<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.companyName = name;
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }
    
    void showStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.dispalayAllEmployee();
        }
    }

    void deleteCompany() {
        departments.clear();
        System.out.println("Company and all its departments and employees deleted.");
    }
    
}

public class Q3 {
    public static void main(String[] args) {
        Company comp = new Company("TechNova");

        Department dev = new Department("Development");
        dev.addEmployee("Alice");
        dev.addEmployee("Bob");

        Department hr = new Department("HR");
        hr.addEmployee("Carol");

        comp.addDepartment(dev);
        comp.addDepartment(hr);

        comp.showStructure();

        // Simulating deletion of company
        comp.deleteCompany();
    }
}



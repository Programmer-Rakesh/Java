class Employee { 
    String employeeName;
    int employeeID;
    String departmentName;

    Employee(String name, int id, String dept) {
        this.employeeName = name;
        this.employeeID = id;
        this.departmentName = dept;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department Name: " + departmentName);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Rakesh Roy", 101, "Electronics Department");

        System.out.println("=== Employee Details ===");
        emp.displayDetails();
    }
}

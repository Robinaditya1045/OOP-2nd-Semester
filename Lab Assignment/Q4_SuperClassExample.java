import java.util.Scanner;

/* 
 4)	Write an application to create a super class Employee with information first name & last name and methods getFirstName(), getLastName(). Derive the sub-classes ContractEmployee and RegularEmployee with the information about department, designation & method displayFullName() , getDepartment(), getDesig() to print the salary and to set department name & designation of the corresponding sub-class objects respectively.
 */



class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class RegularEmployee extends Employee {
    private String department;
    private String designation;

    public RegularEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public void displayFullName() {
        System.out.println("Full Name: " + getFirstName() + " " + getLastName());
    }

    public double calculateSalary() {
        // Add your salary calculation logic here
        return 50000; // Dummy value
    }
}

class ContractEmployee extends Employee {
    private String department;
    private String designation;

    public ContractEmployee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public void displayFullName() {
        System.out.println("Full Name: " + getFirstName() + " " + getLastName());
    }

    public double calculateSalary() {
        // Add your salary calculation logic here
        return 30000; // Dummy value
    }
}

public class Q4_SuperClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Regular Employee
        RegularEmployee regularEmployee = new RegularEmployee("John", "Doe");
        regularEmployee.setDepartment("IT");
        regularEmployee.setDesignation("Software Engineer");
        regularEmployee.displayFullName();
        System.out.println("Department: " + regularEmployee.getDepartment());
        System.out.println("Designation: " + regularEmployee.getDesignation());
        System.out.println("Salary: $" + regularEmployee.calculateSalary());
        System.out.println();

        // Contract Employee
        ContractEmployee contractEmployee = new ContractEmployee("Jane", "Smith");
        contractEmployee.setDepartment("HR");
        contractEmployee.setDesignation("HR Manager");
        contractEmployee.displayFullName();
        System.out.println("Department: " + contractEmployee.getDepartment());
        System.out.println("Designation: " + contractEmployee.getDesignation());
        System.out.println("Salary: $" + contractEmployee.calculateSalary());

        scanner.close();
    }
}

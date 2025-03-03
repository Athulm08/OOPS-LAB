import java.util.ArrayList;
import java.util.Scanner;

// Abstract Employee class
abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to calculate salary
    abstract double calculateSalary();

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Benefits interface
interface Benefits {
    double calculateBenefits();
}

// Manager class
class Manager extends Employee implements Benefits {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return salary + bonus;
    }

    // Overriding calculateBenefits()
    @Override
    public double calculateBenefits() {
        return 5000; // Fixed insurance benefit
    }

    // Method overloading: Assigning projects
    void assignProject(String projectName) {
        System.out.println(name + " assigned to project: " + projectName);
    }

    void assignProject(String projectName, int teamSize) {
        System.out.println(name + " assigned to project: " + projectName + " with team size: " + teamSize);
    }

    // Display details
    void display() {
        displayDetails();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Benefits: " + calculateBenefits());
    }
}

// Developer class
class Developer extends Employee implements Benefits {
    int experience;

    Developer(String name, double salary, int experience) {
        super(name, salary);
        this.experience = experience;
    }

    // Overriding calculateSalary()
    @Override
    double calculateSalary() {
        return salary + (experience * 1000); // Extra 1000 per year of experience
    }

    // Overriding calculateBenefits()
    @Override
    public double calculateBenefits() {
        return experience * 500; // Allowance based on experience
    }

    // Display details
    void display() {
        displayDetails();
        System.out.println("Experience: " + experience + " years");
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Benefits: " + calculateBenefits());
    }
}

// Main class
public class ManageEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        // Taking input for a Manager
        System.out.println("Enter Manager details:");
        System.out.print("Name: ");
        String mgrName = scanner.nextLine();
        System.out.print("Salary: ");
        double mgrSalary = scanner.nextDouble();
        System.out.print("Bonus: ");
        double mgrBonus = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Manager manager = new Manager(mgrName, mgrSalary, mgrBonus);
        employees.add(manager);

        // Taking input for a Developer
        System.out.println("\nEnter Developer details:");
        System.out.print("Name: ");
        String devName = scanner.nextLine();
        System.out.print("Salary: ");
        double devSalary = scanner.nextDouble();
        System.out.print("Experience (years): ");
        int devExp = scanner.nextInt();
        Developer developer = new Developer(devName, devSalary, devExp);
        employees.add(developer);

        // Display all employees
        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager) emp).display();
                ((Manager) emp).assignProject("AI Research");
                ((Manager) emp).assignProject("Cloud Computing", 5);
            } else if (emp instanceof Developer) {
                ((Developer) emp).display();
            }
            System.out.println("----------------------");
        }

        scanner.close();
    }
}

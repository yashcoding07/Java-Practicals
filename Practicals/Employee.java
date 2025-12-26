import java.util.Scanner;

class Employee {
    public static void main(String[] args) {
        Employeesystem e1 = new Employeesystem();
        e1.employeeDetails();
    }
}

class Employeesystem {
    void employeeDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        double salary = input.nextDouble();
        System.out.println("Enter the years of experience: ");
        int experience = input.nextInt();
        System.out.println("Enter role code: ");
        int roleCode = input.nextInt();
        double newSalary;

        if (experience >= 5) {
            newSalary = salary + (salary * 0.25);
        } else if (experience >= 3 && experience <= 4) {
            newSalary = salary + (salary * 0.15);
        } else if (experience >= 0 && experience < 3) {
            newSalary = salary + (salary * 0.5);
        } else {
            System.out.println("Invalid experience");
            return;
        }

        switch (roleCode) {
            case 1:
                System.out.println("Manager");
                System.out.println("New salary: " + newSalary);
                break;
            case 2:
                System.out.println("Developer");
                System.out.println("New salary: " + newSalary);
                break;
            case 3:
                System.out.println("Tester");
                System.out.println("New salary: " + newSalary);
                break;

            default:
                System.out.println("Invalid role code");
                break;
        }
    }
}
class EmployeeSalarySystem{
    public static void main(String[] args){

    }
}

class Employee{
    int empID;
    String empName;
    double basicSalary;

    void getEmployeeDetails(int id, String name, double salary) {
        empID = id;
        empName = name;
        basicSalary = salary;
    }
}

class PermanentEmployee extends Employee{
    double hra;
    double da;
    
    void calculateSalary() {
        hra = 0.2 * basicSalary;
        da = 0.1 * basicSalary;

        double totalSalary = basicSalary + hra + da;
        
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Total salary: " + totalSalary);
    }
}


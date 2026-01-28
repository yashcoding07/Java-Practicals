public class EmployeeSystem {
    public static void main(String[] args){
        PermanentEmployee emp = new PermanentEmployee(101, "Yash", 50000.00);
        emp.displayDetails();
        System.out.println("Employee salary: " + emp.calculateSalary());
    }
}

class Employee{
    private int EmpId;
    protected String EmpName;

    Employee(int EmpId, String EmpName){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
    }

    void displayDetails(){
        System.out.println("Employee Id: " + EmpId);
        System.out.println("Employee Name: " + EmpName);
    }

    double calculateSalary(){
        return 0.0;
    }
}

class PermanentEmployee extends Employee{
    private double monthlySalary;

    PermanentEmployee(int EmpId, String EmpName, Double monthlySalary){
        super(EmpId, EmpName);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary(){
        return monthlySalary;
    }
}
class StudentFeeSystem {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(true);
        Student s3 = new Student(455, "Amit Sharma", "MCA", 80000);

        System.out.println("Student 1 details: ");
        s1.printStudentDetails();
        System.out.println("Final Fee: " + s1.calculateFee());
        
        System.out.println("\nStudent 2 details: ");
        s2.printStudentDetails();
        System.out.println("Final Fee: " + s2.calculateFee(10.0));
        
        System.out.println("\nStudent 3 details: ");
        s3.printStudentDetails();
        System.out.println("Final Fee: " + s3.calculateFee(10.0, 1000));
    }
}

class Student{
    private int studentID;
    private String studentName;
    private String course;
    private double baseFee;

    // default constructor
    Student(){
        studentID = 0;
        studentName = "not assigned";
        course = "general";
        baseFee = 0.0;
    }

    // No argument constructor
    Student(boolean instituteDefault){
        studentID = 100;
        studentName = "New Student";
        course =  "BCA";
        baseFee = 50000;
    }

    // paramaterized constructor
    Student(int studentID, String studentName, String course, double baseFee){
        this.studentID = studentID;
        this.studentName = studentName;
        this.course = course;
        setBaseFee(baseFee);
    }

    // getters and setters
    public int getStudentId() {
        return studentID;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    } 
    
    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }


    public double getBaseFee() {
        return baseFee;
    }

    public void setBaseFee(double baseFee) {
        if (baseFee > 0) {
            this.baseFee = baseFee;
        } else {
            System.out.println("Invalid base fee");
        }
    }

    // fee calculation
    double calculateFee() {
        return baseFee;
    }

    double calculateFee(double scholarshipPercentage) {
        return baseFee - (baseFee * scholarshipPercentage/ 100);
    }

    double calculateFee(double scholarshipPercentage, double additionalCharges) {
        double discountedFee = baseFee - (baseFee * scholarshipPercentage/100);
        return discountedFee + additionalCharges;
    }

    // printing student details
    void printStudentDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("course: " + course);
        System.out.println("base fee: " + baseFee);
    }
}
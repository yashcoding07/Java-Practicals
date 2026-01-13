class StudentSystem {
    public static void main(String[] args){
        Result s1 = new Result();
        s1.getStudentDetails(5642, "hanvi");
        s1.getMarks(54, 78);
        s1.printStudentDetails();
    }    
}

class Student{
    int studentID;
    String studentName;

    void getStudentDetails(int id, String name) {
        studentID = id;
        studentName = name;
    }
}

class Marks extends Student{
    double sub1;
    double sub2;
    double totalMarks;

    double getMarks(double sub1, double sub2){
        return totalMarks = sub1 + sub2;
    }

}

class Result extends Marks {
    double percentage = totalMarks / 2;

    void printStudentDetails(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Result: " + percentage);
    }

}

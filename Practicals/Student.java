import java.util.Scanner;

class Student{

    public static void main(String[] args){
        StudentSystem s1 = new StudentSystem();
        s1.checkStudent();
    }
}

class StudentSystem{

    void checkStudent(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        double fees = 50000;
        double finalFees;

        if (age > 17){
            if(marks > 50){
                System.out.println("The Student is eligible for admission.");
                if (marks > 75){
                    finalFees = fees - (fees * 0.20);
                }else{
                    finalFees = fees - (fees * 0.10);
                }
                System.out.println("Final fees after discount is " + finalFees);
            }else{
                System.out.println("The Student is not eligible for admission due to low marks.");
            }
        }else {
            System.out.println("The Student is not eligible for admission due to age limit.");
        }

    }
}
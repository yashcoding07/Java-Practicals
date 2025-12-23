import java.util.Scanner;

class Add {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = input.nextInt();

        System.out.println("The sum of two numbers is: " + (num1 + num2));

    }
}

import java.util.Scanner;

class Bank{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double balance = 5000.0;
        System.out.println("Enter the amount for withdrawal: ");
        double amount = sc.nextDouble();

        try {
            if(amount > balance){
                throw new InsufficientBalance("Insufficient balance!");
            }
            double result = balance - amount;
                System.out.println("Withdrawal successfull. balance left: " + result);
        } catch (InsufficientBalance e) {
           System.out.println(e.getMessage());
        }
        sc.close();    
    }
}

class InsufficientBalance extends Exception{
    public InsufficientBalance(String message){
        super(message);
    }
}
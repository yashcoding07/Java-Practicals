public class OnlinePaymentSystem {
    public static void main(String[] args){
        Payment ccp = new CreditCardPayment("Yash Parmar");
        Payment upip = new UPIpayment(45635);

        ccp.makePayment(10000);
        ccp.getPaymentMethod();

        upip.makePayment(500);
        upip.getPaymentMethod();
    }
}

interface Payment{
    void makePayment(double amount);
    String getPaymentMethod();
}

class CreditCardPayment implements Payment{
    private String creditCardHolderName;

    CreditCardPayment(String creditCardHolderName){
        this.creditCardHolderName = creditCardHolderName;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("The credit card holder name is " + creditCardHolderName);
        System.out.println("Processing Credit card method of INR: " + amount);
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card Payment";
    }
}

class UPIpayment implements Payment{
    protected int UPIId;

    UPIpayment(int UPIId){
        this.UPIId = UPIId;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Processing UPI payment method of INR: " + amount);
    }

    @Override
    public String getPaymentMethod() {
        return "UPI Payment";
    }
}


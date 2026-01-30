public class OnlineNotificationSystem {
    public static void main(String[] args) {
        notifications en = new EmailNotification("Test@test.com");
        notifications smsn = new SMSnotification(123456789);

        en.sendNotification("Hello World!");
        en.getNotificationType();

        smsn.sendNotification("Hello SMS!");
        smsn.getNotificationType();
    }    
}

interface notifications{
    void sendNotification(String message);
    String getNotificationType();
}

class EmailNotification implements notifications{
    private String EmailID;

    EmailNotification(String EmailID){
        this.EmailID = EmailID;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("The EmailID of the user: " + EmailID);
        System.out.println("message: " + message);
    }

    @Override
    public String getNotificationType() {
        return "Email Notification";
    }
}

class SMSnotification implements notifications{
    private int number;

    SMSnotification(int number){
        this.number = number;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("The message came from the number: " + number);
        System.out.println("message: " + message);
    }

    @Override
    public String getNotificationType() {
        return "SMS Notification";
    }
}

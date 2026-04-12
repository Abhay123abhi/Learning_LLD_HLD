package lowLevelDesign;

interface NotificationService{
    void sendMessage(String message);
}

class EmailService implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent----- " + message);
    }
}

class smsService implements NotificationService{
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent-------" +message);
    }
}
public class demo {
    public static void main(String[] args) {
        NotificationService  notificationService;

        notificationService = new EmailService();
        notificationService.sendMessage("Hello World from email");

        notificationService = new smsService();
        notificationService.sendMessage("Hello World from SMS");
    }
}

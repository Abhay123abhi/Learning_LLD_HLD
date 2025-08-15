package lowLevelDesign.DependencyInversion;

public class DependencyInversionPrinciple {
    interface MessageService{
        void sendMessage(String message);
    }

    public static class EmailService implements MessageService{
        public void sendMessage(String message) {
            System.out.println("Send Email Message"+message);
        }
    }

    public static class SmsService implements MessageService{
        public void sendMessage(String message){
            System.out.println("Send Sms Message");
        }
    }

    static class  Notification{
        private MessageService messageService;
        public Notification(MessageService messageService){
            this.messageService=messageService;
        }
        public void send(String message){
            messageService.sendMessage(message);
        }
    }

    public static void main(String [] args){
        Notification emailNotification = new Notification(new EmailService());
        emailNotification.send("Hello via Email!");

        // Using SmsService
        Notification smsNotification = new Notification(new SmsService());
        smsNotification.send("Hello via SMS!");
    }

}

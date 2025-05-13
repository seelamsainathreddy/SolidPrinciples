package openClosedPrinciple.badOCP;

public class NotificationService {

    public void sendNotification(String type, String message){
        if (type.equals("email")){
            System.out.println("Sending EMAIL: " + message);
        } else if (type.equals("SMS")){
            System.out.println("Send SMS: " + message);
        } else if (type.equals("PUSH")){
            System.out.println("Sending PUSH notification: "+ message);
        }
    }
    
}

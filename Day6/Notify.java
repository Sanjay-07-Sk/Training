package Day6;
class Notification{
    String name;
    String message;

    Notification(String name, String message) {
        this.name = name;
        this.message = message;
    }
    
    void send(){
        System.out.println("Sending from parent class");
    }
}
class EmailNotification extends Notification{
    EmailNotification(String name,String message){
        super(name, message);
    }
    void send(){
        System.out.println("Sending Email to:"+name);
        System.out.println("Message:"+message);
    }
}
class SmsNotification extends Notification{

    SmsNotification(String name,String message) {
        super(name,message);
    }
    
    void send(){
        System.out.println("Sending Sms to:"+name);
        System.out.println("Message:"+message);
    }
}
public class Notify {
    public static void main(String[] args) {
        Notification n;
        n=new EmailNotification("Test1","Order Confirmed");
        n.send();
        n=new SmsNotification("Test2","OTP is 231617");
        n.send();
        //n.ReceiverNotification(); since the reference of the obj is the parent class but ReceiveerNotification is method of child class so it cannot be accessed 
    }
}

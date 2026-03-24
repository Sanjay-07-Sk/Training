package Day4;

class User{
    String name;
    String phone;
    String address;
    String role="User";
    User(){
        System.out.println("User id created");
    }
    User(String name){
        this.name=name;
        System.out.println("User created");
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Role:"+role);
    }
}
class Driver extends User{
    String role="Driver";
    String vehicle;
    Driver(String name,String vehicle){
        super(name);
        this.vehicle=vehicle;
    }
    void displayDriver(){
        super.display();
        System.out.println("Vehicle:"+vehicle);
        System.out.println("Driver class role:"+role);
        System.out.println("User class role:"+super.role);
    }
}
class FoodUser extends User{
    String food;
    FoodUser(){
        System.out.println("FoodUser created");
    }
}
class TravelUser extends User{
    String loc;
    TravelUser(){
        System.out.println("TravelUser created");
    }
}
public class App {
    public static void main(String[] args) {
        Driver d=new Driver("Siva", "BMW m-competition");
        d.displayDriver();
    }
}

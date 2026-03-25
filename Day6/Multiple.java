class User{
    String name;
    String phone;
    String loc;
    User(String name,String phone,String loc){
        this.name=name;
        this.phone=phone;
        this.loc=loc;
    }
    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Phone no:"+phone);
        System.out.println("Address:"+loc);
    }
}
class Ride extends User{
    String vehicle;
    String vtype;
    Ride(String name,String phone,String loc,String vehicle,String vtype){
        super(name,phone,loc);
        this.vehicle=vehicle;
        this.vtype=vtype;
    }
    void displayRide(){
        System.out.println("Ride:");
        super.displayInfo();
        System.out.println("Vehicle:"+vehicle);
        System.out.println("Vehicle type:"+vtype);
    }
}
class Food extends User{
    String food;
    Food(String name,String phone,String loc,String food){
        super(name,phone,loc);
        this.food=food;
    }
    void displayFood(){
        System.out.println("Food:");
        super.displayInfo();
        System.out.println("Food:"+food);
    }
}
class Parcel extends User{
    String parcelweight;
    Parcel(String name,String phone,String loc,String parcelweight){
        super(name,phone,loc);
        this.parcelweight=parcelweight;
    }
    void displayParcel(){
        System.out.println("Parcel:");
        super.displayInfo();
        System.out.println("Parcel Weight:"+parcelweight);
    }
}
public class Multiple {
    public static void main(String[] args) {
        Ride r=new Ride("Thillai", "9344184530", "Sholinganallue", "Swift", "4 wheeler");
        r.displayRide();
        Food f=new Food("Umesh", "9442620667", "Hostel", "Waffle");
        f.displayFood();
        Parcel p=new Parcel("Bright", "9025006946", "Kelambakam", "150 pounds");
        p.displayParcel();
    }
}

class Battery {
    public void powerSupply() {
        System.out.println("Still have 40% power");
    }
}
class Remote {
    Battery miniBattery = new Battery(); // has a relationship
    Remote() {
        miniBattery = new Battery();
    }
    public void changeChannel() {
        miniBattery.powerSupply();
        System.out.println("Channel changed");
    }
    public void changeVolume() {
        System.out.println("Volume increased");
    }
}
class Tv { //Aggregation
    Remote tvRemote;
    Tv(Remote tvRemote) {
        this.tvRemote = tvRemote;
    }
    public void increaseVolume() {
        tvRemote.changeVolume();
    }
}
public class RelationShip {
    public static void main(String[] args) {
        Remote sonyRemote = new Remote();
        Tv sony = new Tv(sonyRemote);
        sony.increaseVolume();
        //Remote tvRemote = new Remote();
        //tvRemote.changeChannel();
    }
}

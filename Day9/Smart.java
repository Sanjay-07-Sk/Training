abstract class SmartDevice {
    abstract void turnOn();
    abstract void turnOff();
    abstract void setLevel();
    void deviceInfo() {
        System.out.println("It is a device");
    }
}
class Light extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Light on");
    }
    @Override
    void turnOff() {
        System.out.println("Light off");
    }
    @Override
    void setLevel() {
        System.out.println("Light is set to warm");
    }
}
interface Remote {
    void change();
}
interface WifiControl {
    void connect();
    void change();
}
class TV implements Remote, WifiControl {
    @Override
    public void change() {
        System.out.println("Change channel");
    }
    @Override
    public void connect() {
        System.out.println("Wifi connected");
    }
}
class Fan extends SmartDevice {
    @Override
    void turnOn() {
        System.out.println("Fan on");
    }
    @Override
    void turnOff() {
        System.out.println("Fan off");
    }
    @Override
    void setLevel() {
        System.out.println("Fan speed is set to 3");
    }
}
public class Smart {
    public static void main(String[] args) {
        SmartDevice d = new Light(); //Object mut be created only for child class
        Remote r = new TV();
        WifiControl w = new TV();
        d.turnOn();
        d.deviceInfo(); //Meth9ds in parent class can be accessed by the child class
        d.setLevel();
        d = new Fan();
        d.turnOn();
        d.deviceInfo();
        d.setLevel();
        r.change();
        w.connect();
        w.change();
    }
}

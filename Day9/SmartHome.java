abstract class Home {
    String name;
    Home(String name) {
        this.name = name;
    }
    abstract void turnOn();
    abstract void turnOff();
}


class Light extends Home {
    Light(String name) {
        super(name);
    }
    @Override
    void turnOn() {
        System.out.println("Light turned on");
    }
    @Override
    void turnOff() {
        System.out.println("Light turned off");
    }
}


class Ac extends Home {
    Ac(String name) {
        super(name);
    }
    @Override
    void turnOn() {
        System.out.println("Ac turned on");
    }
    @Override
    void turnOff() {
        System.out.println("Ac turned off");
    }
}


interface trigger {
    boolean isTriggered();
}


class motiontrigger implements trigger {
    @Override
    public boolean isTriggered() {
        System.out.println("Motion detected");
        return true;
    }
}


class tempTrigger implements trigger {
    int temp;
    tempTrigger(int temp) {
        this.temp = temp;
    }
    @Override
    public boolean isTriggered() {
        if (temp > 30) {
            System.out.println("Temperature triggered");
            return true;
        }
        return false;
    }
}


class timeTrigger implements trigger {
    int time;
    timeTrigger(int time) {
        this.time = time;
    }
    @Override
    public boolean isTriggered() {
        if (time > 7) {
            System.out.println("Time triggered");
            return true;
        }
        return false;
    }
}

interface action {
    void execute();
}

class turnOnAction implements action {
    Home h;
    turnOnAction(Home h) {
        this.h = h;
    }
    @Override
    public void execute() {
        h.turnOn();
    }
}

class Link {
    trigger t;
    action a;
    Link(trigger t, action a) {
        this.t = t;
        this.a = a;
    }
    void result() {
        if (t.isTriggered()) {
            a.execute();
        } else {
            System.out.println("Trigger condition not met");
        }
    }
}
class SmartHome {
    public static void main(String[] args) {
        Home light = new Light("Light");
        Home ac = new Ac("AC");
        trigger motion = new motiontrigger();
        trigger temp = new tempTrigger(35);
        trigger time = new timeTrigger(8);
        action Lighton = new turnOnAction(light);
        action acon = new turnOnAction(ac);
        Link l1 = new Link(motion, Lighton);
        Link l2 = new Link(temp, acon);
        Link l3 = new Link(time, Lighton);
        l1.result();
        l2.result();
        l3.result();
    }
}

/*Design locker system where user can store items securely

Each locker protect its internal data and only controlled operatoion

requirements
 each locker has locker id,islocker(boolean),pin,stored item
operations
 store iten(ite,pin),retrieve item(pin),lock(),unlock(pin)
rules
 items cannot be accessed directly
 locker opens only with crt pin
 invalid access should be blocked*/
class Locker {
    private int id;
    private int pin;
    private boolean lock = true;
    private String item = "";
    Locker(int id, int pin) {
        this.id = id;
        this.pin = pin;
    }
    public void storeItem(String item, int pincode) {
        if (pin == pincode) {
            if (!isLocked()) {
                this.item = item;
                System.out.println("Item stored");
            }
        } else {
            System.out.println("Wrong pin");
        }
    }
    public void retrieveItem(int pincode) {
        if (pin == pincode) {
            if (!isLocked() && item != null) {
                System.out.println("Item:" + item);
                item = null;
            } else if (item == null) {
                System.out.println("Locker is empty");
            }
        } else {
            System.out.println("Wrong pin");
        }
    }
    public boolean isLocked() {
        if (lock) {
            return true;
        }
        return false;
    }
    public void lock() {
        System.out.println("Locked");
        lock = true;
    }
    public void unlock(int pincode) {
        if (pincode == pin) {
            lock = false;
        } else {
            System.out.println("Wrong pin");
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        Locker l = new Locker(304, 198);
        l.unlock(198);
        l.storeItem("Gold", 198);
        l.retrieveItem(198);
        System.out.println(l.isLocked());
    }
}

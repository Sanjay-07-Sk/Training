package Day7;
class Character{
    String name;

    Character(String name) {
        this.name = name;
    }
    void attack(){}
}
class Warrior extends Character{

    Warrior(String name) {
        super(name);
    }
    @Override
    void attack(){
        System.out.println(name+" attack with sword");
    }
}
class Archer extends Character{

    Archer(String name) {
        super(name);
    }
    @Override
    void attack(){
        System.out.println(name+" attack with arrow");
    }
}
class Mage extends Character{

    Mage(String name) {
        super(name);
    }
    @Override
    void attack(){
        System.out.println(name+" attack with magic");
    }
}
public class Game {
    public static void main(String[] args) {
        Character c;
        c=new Warrior("Sivamoorthy");
        c.attack();
        c=new Archer("Saai");
        c.attack();
        c=new Mage("Thillai");
        c.attack();
    }
}

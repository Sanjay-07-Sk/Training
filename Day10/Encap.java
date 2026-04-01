class BankAccount {
    private double balance = 1000;
    public void setBalance(double balance) { //setters
        if (balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("Invalid Input");
        }
    }
    public void withdraw(int amount) {
        if (amount > 0 AND balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount credited:" + amount);
        } else {
            System.out.println("Invalid input");
        }
    }
    public double getBalance() { //getters
        return balance;
    }
}

public class Encap {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(20000);
        System.out.println(b.getBalance());
        b.withdraw(10000);
        System.out.println(b.getBalance());
        b.deposit(100);
    }
}

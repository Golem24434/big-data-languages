public class Bank {
    private int balance;

    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit: " + amount + ", balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal: " + amount + ", balance: " + balance);
        } else {
            System.out.println("Insufficient funds, balance: " + balance);
        }
    }
}
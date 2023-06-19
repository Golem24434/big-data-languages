import java.util.Random;
public class BankThread implements Runnable {
    private Bank bank;
    private boolean isDeposit;
    private Random random = new Random();

    public BankThread(Bank bank, boolean isDeposit) {
        this.bank = bank;
        this.isDeposit = isDeposit;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int amount = random.nextInt(1000);
            if (isDeposit) {
                bank.deposit(amount);
            } else {
                bank.withdraw(amount);
            }
        }
    }
}
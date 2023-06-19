public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(10000);
        Thread depositThread = new Thread(new BankThread(bank, true));
        Thread withdrawalThread = new Thread(new BankThread(bank, false));
        depositThread.start();
        withdrawalThread.start();
    }
}
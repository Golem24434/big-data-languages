import java.util.ArrayList;
import java.util.List;

public class Sale {
    private double amount;
    private Client client;

    public Sale(double amount, Client client) {
        this.amount = amount;
        this.client = client;
    }

    public double getAmount() {
        return amount;
    }

    public Client getClient() {
        return client;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    private Client client;

    public Order(List<Product> products, Client client) {
        this.products = products;
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Client getClient() {
        return client;
    }

    public double calculateTotal() {
        return 100;
    }
}
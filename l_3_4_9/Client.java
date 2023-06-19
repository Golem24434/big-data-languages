import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;
    private String address;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void placeOrder(Order order) {
        // реализация оформления заказа
    }
}
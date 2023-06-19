import java.util.ArrayList;
import java.util.List;

public class Administrator {
    private List<Product> products;

    public Administrator() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void registerSale(Sale sale) {
        // реализация регистрации продажи
    }

    public void addToBlacklist(Client client) {
        // реализация добавления клиента в черный список
    }
}
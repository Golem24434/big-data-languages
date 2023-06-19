import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Administrator admin = new Administrator();

        // добавление информации о товаре
        Product product1 = new Product("Товар 1", 100.0);
        Product product2 = new Product("Товар 2", 200.0);
        admin.addProduct(product1);
        admin.addProduct(product2);

        // создание клиента
        Client client1 = new Client("Иванов", "ул. Пушкина, дом Колотушкина");

        // создание заказа
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        Order order = new Order(products, client1);

        // оформление заказа
        client1.placeOrder(order);

        // оплата заказа
        double total = order.calculateTotal();
        // реализация оплаты заказа

        // регистрация продажи
        Sale sale = new Sale(total, client1);
        admin.registerSale(sale);

        // добавление клиента в черный список
        admin.addToBlacklist(client1);
    }
}
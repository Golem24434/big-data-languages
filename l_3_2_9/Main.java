import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductArray products = new ProductArray();
        products.addProduct(new Product(1, "Banana", "123456789", "Fruit Corp.", 0.5, 7, 10));
        products.addProduct(new Product(2, "Apple", "987654321", "Fruit Corp.", 0.8, 14, 5));
        products.addProduct(new Product(3, "Orange", "456789123", "Fruit Corp.", 0.6, 10, 8));

        // Список товаров для заданного наименования
        ArrayList<Product> result1 = products.getProductsByName("Apple");
        for (Product product : result1) {
            System.out.println(product.toString());
        }

        // Список товаров для заданного наименования, цена которых не превосходит заданную
        ArrayList<Product> result2 = products.getProductsByPriceAndName("Banana", 1.0);
        for (Product product : result2) {
            System.out.println(product.toString());
        }

        // Список товаров, срок хранения которых больше заданного
        ArrayList<Product> result3 = products.getProductsByShelfLife(9);
        for (Product product : result3) {
            System.out.println(product.toString());
        }
    }
}
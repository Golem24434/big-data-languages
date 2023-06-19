import java.util.ArrayList;

public class ProductArray {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public ArrayList<Product> getProductsByName(String name) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name)) {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> getProductsByPriceAndName(String name, double price) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name) && product.getPrice() <= price) {
                result.add(product);
            }
        }
        return result;
    }

    public ArrayList<Product> getProductsByShelfLife(int shelfLife) {
        ArrayList<Product> result = new ArrayList<>();
        for (Product product : products) {
            if (product.getShelfLife() > shelfLife) {
                result.add(product);
            }
        }
        return result;
    }
}
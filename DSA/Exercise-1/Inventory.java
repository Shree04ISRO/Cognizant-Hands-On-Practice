import java.util.HashMap;

public class Inventory {

    HashMap<Integer, Product> products =
            new HashMap<Integer, Product>();

    void addProduct(Product p) {

        products.put(p.productId, p);
    }

    void deleteProduct(int id) {

        products.remove(id);
    }

    void displayProducts() {

        for(Product p : products.values()) {

            System.out.println(p);
        }
    }
}
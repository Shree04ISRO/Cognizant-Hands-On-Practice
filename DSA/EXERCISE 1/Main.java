public class Main {

    public static void main(String[] args) {

        Inventory inventory =
                new Inventory();

        Product p1 =
                new Product(
                        101,
                        "Laptop",
                        10,
                        50000);

        Product p2 =
                new Product(
                        102,
                        "Mouse",
                        50,
                        500);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        System.out.println("Products:");

        inventory.displayProducts();

        inventory.deleteProduct(102);

        System.out.println(
                "\nAfter Deletion:");

        inventory.displayProducts();
    }
}
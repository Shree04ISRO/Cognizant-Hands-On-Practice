public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(
                        101,
                        "Keyboard",
                        "Electronics"),

                new Product(
                        102,
                        "Laptop",
                        "Electronics"),

                new Product(
                        103,
                        "Mobile",
                        "Electronics"),

                new Product(
                        104,
                        "Mouse",
                        "Electronics"),

                new Product(
                        105,
                        "Printer",
                        "Electronics")
        };

        System.out.println(
                "Linear Search:");

        Product p1 =
                SearchOperations
                        .linearSearch(
                                products,
                                "Mouse");

        if(p1 != null)
            System.out.println(p1);

        System.out.println(
                "\nBinary Search:");

        Product p2 =
                SearchOperations
                        .binarySearch(
                                products,
                                "Mouse");

        if(p2 != null)
            System.out.println(p2);
    }
}
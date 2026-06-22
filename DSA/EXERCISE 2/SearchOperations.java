public class SearchOperations {

    // Linear Search
    static Product linearSearch(
            Product[] products,
            String name) {

        for(Product p : products) {

            if(p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }

        return null;
    }

    // Binary Search
    static Product binarySearch(
            Product[] products,
            String name) {

        int low = 0;
        int high = products.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                    products[mid]
                    .productName
                    .compareToIgnoreCase(name);

            if(result == 0)
                return products[mid];

            else if(result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }
}
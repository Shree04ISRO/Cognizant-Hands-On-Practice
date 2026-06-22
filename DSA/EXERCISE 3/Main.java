public class Main {

    public static void main(String[] args) {

        Order[] orders = {

                new Order(
                        101,
                        "Hari",
                        4500),

                new Order(
                        102,
                        "Ravi",
                        1200),

                new Order(
                        103,
                        "Kumar",
                        8000),

                new Order(
                        104,
                        "John",
                        3000)
        };

        System.out.println(
                "Before Sorting:");

        for(Order o : orders) {

            System.out.println(o);
        }

        SortingOperations.quickSort(
                orders,
                0,
                orders.length - 1);

        System.out.println(
                "\nAfter Quick Sort:");

        for(Order o : orders) {

            System.out.println(o);
        }
    }
}
public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(
                        101,
                        "C Programming",
                        "Dennis Ritchie"),

                new Book(
                        102,
                        "Data Structures",
                        "Mark Allen"),

                new Book(
                        103,
                        "Java Programming",
                        "Herbert Schildt"),

                new Book(
                        104,
                        "Python Programming",
                        "Guido Rossum"),

                new Book(
                        105,
                        "Web Technology",
                        "John Duckett")
        };

        System.out.println(
                "Linear Search:");

        Book b1 =
                LibrarySearch.linearSearch(
                        books,
                        "Java Programming");

        if(b1 != null)
            System.out.println(b1);

        System.out.println(
                "\nBinary Search:");

        Book b2 =
                LibrarySearch.binarySearch(
                        books,
                        "Java Programming");

        if(b2 != null)
            System.out.println(b2);
    }
}
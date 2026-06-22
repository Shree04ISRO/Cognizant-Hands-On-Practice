public class LibrarySearch {

    // Linear Search
    static Book linearSearch(
            Book[] books,
            String title) {

        for(Book b : books) {

            if(b.title.equalsIgnoreCase(title)) {

                return b;
            }
        }

        return null;
    }

    // Binary Search
    static Book binarySearch(
            Book[] books,
            String title) {

        int low = 0;
        int high = books.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            int result =
                    books[mid]
                    .title
                    .compareToIgnoreCase(title);

            if(result == 0)
                return books[mid];

            else if(result < 0)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }
}
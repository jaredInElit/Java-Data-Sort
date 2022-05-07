package bookSorting;
import java.util.NoSuchElementException;
import java.util.Optional;

public class BookOptional {

    

        public static void main(String[] args) {
            new BookOptional().run();

        }

        private void run() {
            Book books = bookMethod(Optional.of(new Book("Reformed Systematic Theology")));
            System.out.println(books + ".");

            try {
                bookMethod(Optional.empty());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private Book bookMethod(Optional<Book> bookOptional) {
            return bookOptional.orElseThrow(() -> new NoSuchElementException("This book is not present"));
        }

}
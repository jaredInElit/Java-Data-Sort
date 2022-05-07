package bookSorting;

import java.util.List;

public class BookSort {
    
    public static void main(String[] args) {
        new BookSort().run();
    }
    
    private void run() {
        boolean sortWithLambda = true;
        List<Book> books;
        String name;
    
        System.out.println(Book.getBooks());
    
        if (sortWithLambda) {
            books = sortWithLambda();
            name = "Lambda: ";
        }
        else {
            books = sortWithMethod();
            name = "Method: ";
        }
        System.out.println(name + books);
    }
    
    
    
    private List<Book> sortWithMethod(){
        List<Book> books = Book.getBooks();
        books.sort(Book::compare);
        return books;
    }
    
    
    
    private List<Book> sortWithLambda(){
        List <Book> books = Book.getBooks();
        books.sort((b1, b2) -> b1.compare(b2));
        return books;
    }
    

}

package bookSorting;

import java.util.stream.Collectors;

public class BookStream {

    
    public static void main(String[] args) {
        new BookStream().run();

    }

    private void run() {
        String names = Book
                .getBooks() 
                .stream()                                       
                .map(p -> p.toString())                         
                .sorted()                                       
                .collect(Collectors.joining(", "));             
        System.out.println(names);
    }
}
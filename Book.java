package bookSorting;

import java.util.LinkedList;
import java.util.List;

public class Book {

    private String name;

    public String getName() {
        return name;
    }
    public String toString() {
        return "Title: " + name;
    }
    public Book(String name) {
        this.name = name;
    }
    public int compare(Book that) {
        return this.name.compareTo(that.name);
    }
    private static final List<Book> books = List.of(
            new Book("Napoleon: A Life"),new Book("Caesar"),new Book("The Wonderful Works of God")
            ,new Book("1776")
            );
    
    public static List<Book> getBooks() {
        return new LinkedList<>(books);
    }
    
}
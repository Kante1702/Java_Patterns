package behavioralPatterns.Iteratorr.first;


import java.util.ArrayList;
import java.util.List;


public class BookShelf implements Collectionn {

    private List<String> books = new ArrayList<>();

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public BookShelfIterator createIterator() {
        return new BookShelfIterator(this);
    }
    public List<String> getBooks() {
        return books;
    }
}

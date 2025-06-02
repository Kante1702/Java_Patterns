package behavioralPatterns.Iteratorr.first;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("prva");
        bookShelf.addBook("druhaa");
        bookShelf.addBook("tretia");

        Iterator iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

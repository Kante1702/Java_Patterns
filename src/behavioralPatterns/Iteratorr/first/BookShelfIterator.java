package behavioralPatterns.Iteratorr.first;

public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < bookShelf.getBooks().size();
    }
    @Override
    public String next(){
        if(hasNext()){
            return bookShelf.getBooks().get(index++);
        }
        return null;
    }


}

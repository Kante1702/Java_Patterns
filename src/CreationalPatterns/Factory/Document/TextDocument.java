package CreationalPatterns.Factory.Document;

public class TextDocument implements Document{


    @Override
    public void open() {
        System.out.println("Opening a text document");
    }
}

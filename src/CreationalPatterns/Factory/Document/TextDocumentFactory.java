package CreationalPatterns.Factory.Document;

public class TextDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}

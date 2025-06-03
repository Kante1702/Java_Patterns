package CreationalPatterns.Factory.Document;

public class PdfDocumentFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

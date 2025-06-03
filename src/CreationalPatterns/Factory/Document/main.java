package CreationalPatterns.Factory.Document;

public class main {
    public static void main(String[] args) {

        DocumentFactory documentFactory = new TextDocumentFactory();
        Document document = documentFactory.createDocument();
        document.open();

        documentFactory = new PdfDocumentFactory();
        document = documentFactory.createDocument();
        document.open();


//        Opening a text document
//        Opening a PDF document

    }
}

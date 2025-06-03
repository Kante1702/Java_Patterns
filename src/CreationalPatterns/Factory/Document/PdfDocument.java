package CreationalPatterns.Factory.Document;

public class PdfDocument implements Document{
    @Override
    public void open() {
        System.out.println("Opening a PDF document");
    }
}

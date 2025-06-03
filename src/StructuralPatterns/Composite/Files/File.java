package StructuralPatterns.Composite.Files;

public class File implements FileSystemComponent{
//zarazka = indent

   private String fileName;
   public File(String fileName) {
       this.fileName = fileName;
   }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- File: " + fileName);
    }
}

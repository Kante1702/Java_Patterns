package StructuralPatterns.Composite.Files;

public class Main {
    public static void main(String[] args) {

        FileSystemComponent file1 = new File("file1.txt");
        FileSystemComponent file2 = new File("file2.txt");
        FileSystemComponent file3 = new File("file3.txt");

        Directory folder = new Directory("Documents");
        folder.addChild(file1);
        folder.addChild(file2);

        Directory root = new Directory("Root");
        root.addChild(folder);
        root.addChild(file3);

        root.display("");


//        Directory: Root
//        Directory: Documents
//                - File: file1.txt
//                - File: file2.txt
//                - File: file3.txt

    }
}

package StructuralPatterns.Composite.Files;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
//zarazka = indent
    private String name;
    private List<FileSystemComponent> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addChild(FileSystemComponent child) {
        children.add(child);
    }
    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name );
        for (FileSystemComponent child : children) {
            child.display(indent + "  ");
        }
    }
}

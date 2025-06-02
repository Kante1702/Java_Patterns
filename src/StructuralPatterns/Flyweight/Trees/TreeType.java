package StructuralPatterns.Flyweight.Trees;

public class TreeType {
//spolocne vlastnosti
    private String color;
    private String name;
    private String texture;

    public TreeType(String color, String name, String texture) {
        this.color = color;
        this.name = name;
        this.texture = texture;
    }

    public void draw(int x , int y){
        System.out.println("Drawing "+name +"tree at "+x+" a "+y+" s farbou "+color+ " a texturov "+texture);
    }

}

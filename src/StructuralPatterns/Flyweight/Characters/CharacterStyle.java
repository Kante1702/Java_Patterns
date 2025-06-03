package StructuralPatterns.Flyweight.Characters;

public class CharacterStyle {
    //zdielane spolocne data
    private String font;
    private int size;
    private String color;

    public CharacterStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }
    public void apply(char c){
        System.out.println("Drawing '" + c + "' in " + font + ", size " + size + ", color " + color);
    }

}

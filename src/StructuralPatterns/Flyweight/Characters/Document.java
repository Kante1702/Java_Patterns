package StructuralPatterns.Flyweight.Characters;

import java.util.ArrayList;
import java.util.List;

public class Document {   public static void main(String[] args) {
    List<TextCharacter> text = new ArrayList<>();

    CharacterStyle style1 = StyleFactory.getStyle("Arial", 12, "black");
    CharacterStyle style2 = StyleFactory.getStyle("Arial", 12, "black"); // reused
    CharacterStyle style3 = StyleFactory.getStyle("Courier", 10, "blue");

    text.add(new TextCharacter('H', 0, style1));
    text.add(new TextCharacter('e', 1, style2));
    text.add(new TextCharacter('y', 2, style3));

    for (TextCharacter c : text) {
        c.draw();
    }

//    At pos 0: Drawing 'H' in Arial, size 12, color black
//    At pos 1: Drawing 'e' in Arial, size 12, color black
//    At pos 2: Drawing 'y' in Courier, size 10, color blue


}
}

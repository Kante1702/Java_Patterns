package StructuralPatterns.Flyweight.Characters;

public class TextCharacter {
    private char character;
    private int position;
    private CharacterStyle characterStyle; //shared

    //konkretny znak
    public TextCharacter(char character, int position, CharacterStyle characterStyle) {
        this.character = character;
        this.position = position;
        this.characterStyle = characterStyle;
    }

    public void draw(){
        System.out.print("At pos " + position + ": ");
        characterStyle.apply(character);
    }
}

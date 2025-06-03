package StructuralPatterns.Flyweight.Characters;

import java.util.HashMap;
import java.util.Map;

public class StyleFactory {
//factory ktora spravuje tie zdielane data
    private static Map<String,CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(String font,int size,String color) {

        String key = font+size+color;
        if(!styles.containsKey(key)) {
            styles.put(key,new CharacterStyle(font,size,color));
        }
        return styles.get(key);

    }
}

package StructuralPatterns.Flyweight.Trees;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String,TreeType> treeTypes = new HashMap<>();
    //stara sa o treetype
    public static TreeType getTreeType(String name,String color, String texture){

        String key = name +"-"+ color +"-"+ texture; //charakterizujem kluc

        if(!treeTypes.containsKey(key)){ //ak neobsahuje kluc tak
            treeTypes.put(key,new TreeType(name,color,texture));
        }
        return treeTypes.get(key);
    }

}

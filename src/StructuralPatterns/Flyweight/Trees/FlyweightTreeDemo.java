package StructuralPatterns.Flyweight.Trees;

public class FlyweightTreeDemo {
    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10, 20, "Oak", "Green", "Rough");
        forest.plantTree(15, 25, "Oak", "Green", "Rough");
        forest.plantTree(50, 60, "Pine", "Dark Green", "Smooth");
        forest.draw();

//        Drawing Greentree at 10 a 20 s farbou Oak a texturov Rough
//        Drawing Greentree at 15 a 25 s farbou Oak a texturov Rough
//        Drawing Dark Greentree at 50 a 60 s farbou Pine a texturov Smooth

    }
}

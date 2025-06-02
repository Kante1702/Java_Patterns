package StructuralPatterns.Flyweight.Circles;

public class FlyweightCirclesPatternDemo {

    private static final String[] colors = {"red", "green", "blue", "orange", "yellow"};
    public static void main(String[] args) {

        for(int i =0; i<20; i++){
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setPosition(getRandomX(), getRandomY());
            circle.draw();
        }

    }
    private static String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }
    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }
    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }

}

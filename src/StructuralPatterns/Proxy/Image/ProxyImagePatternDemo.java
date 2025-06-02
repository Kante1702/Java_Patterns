package StructuralPatterns.Proxy.Image;

public class ProxyImagePatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");
        System.out.println("first call");
        image.display();//nacita a zobrazi
        System.out.println("second call");
        image.display();//uz len zobrazi

//        first call
//        Loading image from disk: test.png
//        Displaying image test.png
//        second call
//        Displaying image test.png

    }
}

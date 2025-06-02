package StructuralPatterns.Facade.HomeTheater;

public class Projector {

    public void on(){
        System.out.println("Projector is On");
    }
    public void off(){
        System.out.println("Projector is Off");
    }
    public void setInput(String input){
        System.out.println("Projector input set to: " + input);
    }
}

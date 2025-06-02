package StructuralPatterns.Facade.HomeTheater;

public class DVDPlayer {

    public void on(){
        System.out.println("DVDPlayer is on");
    }
    public void off(){
        System.out.println("DVDPlayer is off");
    }
    public void play(String movie){
        System.out.println("Playing movie  " + movie);
    }

}

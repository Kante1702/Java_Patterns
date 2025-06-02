package StructuralPatterns.Facade.HomeTheater;

public class SoundSystem {

    public void on(){
        System.out.println("Sound system is on");
    }
    public void off(){
        System.out.println("Sound system is off");
    }
    public void setVolume(int level){
        System.out.println("Sound system volume is set to " + level);
    }
}

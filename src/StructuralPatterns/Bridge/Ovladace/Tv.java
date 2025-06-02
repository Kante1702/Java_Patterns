package StructuralPatterns.Bridge.Ovladace;

public class Tv implements Device{


    private boolean on = false;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Tv is turned on");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Tv is turned off");
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}

package StructuralPatterns.Bridge.Ovladace;

public class Radio implements Device{

    private boolean on = false;

    @Override
    public void turnOn() {
        System.out.println("Radio is on");
        on = true;
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is off");
        on = false;
    }

    @Override
    public boolean isEnabled() {
        return on;
    }
}

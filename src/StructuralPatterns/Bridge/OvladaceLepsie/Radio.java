package StructuralPatterns.Bridge.OvladaceLepsie;

public class Radio implements Device{
    @Override
    public void turnOn() {
        System.out.println("Radio is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned off");
    }
}

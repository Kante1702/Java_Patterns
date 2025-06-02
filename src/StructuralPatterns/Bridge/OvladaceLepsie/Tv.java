package StructuralPatterns.Bridge.OvladaceLepsie;

public class Tv implements Device{

    @Override
    public void turnOn() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV OFF");
    }
}

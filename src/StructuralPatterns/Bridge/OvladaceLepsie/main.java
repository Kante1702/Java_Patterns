package StructuralPatterns.Bridge.OvladaceLepsie;

public class main {
    public static void main(String[] args) {
        Device tv = new Tv();
        Device Radio = new Radio();

        RemoteControl tvRemote = new BasicRemote(tv);
        RemoteControl RadioRemote = new BasicRemote(Radio);

        tvRemote.turnON();
        RadioRemote.turnOFF();
    }
}

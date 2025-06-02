package StructuralPatterns.Bridge.OvladaceLepsie;


public class BasicRemote extends RemoteControl {

    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void turnON() {
        System.out.println("Remote:");
        device.turnOn();
    }

    @Override
    public void turnOFF() {
        System.out.println("Remote:");
        device.turnOff();
    }
}

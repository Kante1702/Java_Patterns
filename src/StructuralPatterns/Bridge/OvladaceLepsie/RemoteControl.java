package StructuralPatterns.Bridge.OvladaceLepsie;

public abstract class RemoteControl {

    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }
    public abstract void turnON();
    public abstract void turnOFF();

}

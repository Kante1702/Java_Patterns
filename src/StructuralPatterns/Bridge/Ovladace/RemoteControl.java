package StructuralPatterns.Bridge.Ovladace;
//mohol som aj vytvorit remote interface a pouzit tu tie metody
public class RemoteControl {

    protected Device device;
    public RemoteControl(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if(device.isEnabled())
        {
            device.turnOff();
        }
        else {
            device.turnOn();
        }
    }
}

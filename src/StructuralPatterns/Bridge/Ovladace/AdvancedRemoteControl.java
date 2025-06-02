package StructuralPatterns.Bridge.Ovladace;

public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }
    public void mute(){
        if(device.isEnabled()){
            System.out.println("device is muted");
        }
    }
}

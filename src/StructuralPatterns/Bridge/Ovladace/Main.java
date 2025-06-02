package StructuralPatterns.Bridge.Ovladace;

public class Main {
    public static void main(String[] args) {
        Device tv = new Tv();
        Device radio = new Radio();

        RemoteControl tvRemote = new RemoteControl(tv);
        RemoteControl radioRemote = new AdvancedRemoteControl(radio);

        tvRemote.togglePower();         // TV is turned ON
        radioRemote.togglePower();      // Radio is turned ON
        ((AdvancedRemoteControl) radioRemote).mute(); // Device is now muted
    }
}

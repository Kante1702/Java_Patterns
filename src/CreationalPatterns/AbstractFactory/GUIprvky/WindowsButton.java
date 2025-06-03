package CreationalPatterns.AbstractFactory.GUIprvky;

public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println("Rendering WindowsButton");
    }
}

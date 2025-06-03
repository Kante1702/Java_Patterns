package CreationalPatterns.AbstractFactory.GUIprvky;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }
    public void renderUI(){
        button.render();
        checkBox.render();
    }
}

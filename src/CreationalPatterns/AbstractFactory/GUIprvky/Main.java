package CreationalPatterns.AbstractFactory.GUIprvky;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory;

        // napr. na základe OS
        String os = "Windows";
        if (os.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();


//        Rendering WindowsButton
//        Rendering Windows CheckBox

    }
}

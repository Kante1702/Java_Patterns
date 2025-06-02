package StructuralPatterns.Adapter.first;

public class Main {
    public static void main(String[] args) {

        InterfaceMultiRestoApp multiRestoApp = new MultiRestoApp();
        //multiRestoApp.displayMenus(new XMLDecoder());

        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter();
        //adapter.displayMenus();
    }
}

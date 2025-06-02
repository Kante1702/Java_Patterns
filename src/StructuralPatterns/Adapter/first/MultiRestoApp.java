package StructuralPatterns.Adapter.first;

import java.beans.XMLDecoder;
//taktiez existujuci system a implementacia metod
public class MultiRestoApp implements InterfaceMultiRestoApp {
    @Override
    public void displayMenus(XMLDecoder xmlData) {
        //logic
    }

    @Override
    public void displayRecommendations(XMLDecoder xmlData) {
        //logic
    }
}

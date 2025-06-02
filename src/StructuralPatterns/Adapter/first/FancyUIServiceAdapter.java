package StructuralPatterns.Adapter.first;

import netscape.javascript.JSObject;

import java.beans.XMLDecoder;

public class FancyUIServiceAdapter implements InterfaceMultiRestoApp{

    //adapter v ktorom implementujem existujuce metody/system
    private final FancyUIService fancyUIService;
    public FancyUIServiceAdapter() {
        fancyUIService = new FancyUIService();

    }

    @Override
    public void displayMenus(XMLDecoder xmlData) {
        JSObject jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XMLDecoder xmlData) {
        JSObject jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }
    private JSObject convertXmlToJson(XMLDecoder xmlData) {
        //convert xml to json and return it
        return null;
    }
}

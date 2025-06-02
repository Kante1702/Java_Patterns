package StructuralPatterns.Adapter.first;

import java.beans.XMLDecoder;
//existujuci system metody
public interface InterfaceMultiRestoApp {
    //xmldata = xmldecoder.... (na ukazku)
    void displayMenus(XMLDecoder xmlData);
    void displayRecommendations(XMLDecoder xmlData);
}

package behavioralPatterns.ChainOfResponsibility.second;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Database database = new Database();
        Handler handler = new UserExistsHandler(database).setNext(new ValidPasswordHandler(database)).setNext(new RoleCheckHandler());
        AuthService service = new AuthService(handler);
        service.login("username", "password");

//        Loading default page
//        auth successful
    }
}

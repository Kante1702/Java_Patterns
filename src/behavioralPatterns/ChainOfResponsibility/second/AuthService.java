package behavioralPatterns.ChainOfResponsibility.second;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    //simuluje login proces

    public boolean login(String email, String password) {

        //spusta sa prvy handler
        if (handler.handle(email, password)) {
            System.out.println("auth successful");

            return true;
        }
        return false;
    }
}

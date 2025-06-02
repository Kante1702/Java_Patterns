package behavioralPatterns.ChainOfResponsibility.second;

public class RoleCheckHandler extends Handler{
   //handler na role check
    @Override
    public boolean handle(String username, String password) {
        if("admin_username".equals(username)){
            System.out.println("Loading admin page");
            return true;
        }
        System.out.println("Loading default page");
        return handleNext(username,password);
    }
}

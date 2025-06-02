package behavioralPatterns.ChainOfResponsibility.second;

public class UserExistsHandler extends Handler{
    //handler na user exists
    private Database database;
    public UserExistsHandler(Database database) {
        this.database = database;
    }




    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUser(username)){
            System.out.println("this username is not registered");
            return false;
        }
        return handleNext(username,password);
    }
}

package behavioralPatterns.ChainOfResponsibility.second;

public abstract class Handler {
    //abstract classa pre handler methody
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;//umozni retazenie
    }
    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username,String password) {
        if(next == null){
            return true;
        }
        return next.handleNext(username,password);
    }
}

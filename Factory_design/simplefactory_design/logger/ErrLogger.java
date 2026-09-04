package logger;


public class ErrLogger implements ILogger{

    public void log(String msg){
        System.out.println("Error: "+msg);
    }
    
}
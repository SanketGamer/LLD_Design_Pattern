import logger.*;



public class Main{
    public static void main(String[] args){
        ILogger debugLogger=LoggerFactory.createLogger(MyLogLevel.DEBUG);
        ILogger InfoLogger=LoggerFactory.createLogger(MyLogLevel.INFO);
        ILogger ErrLogger=LoggerFactory.createLogger(MyLogLevel.ERROR);

        debugLogger.log("this is a debug msg");
        InfoLogger.log("this ia a info msg");
        ErrLogger.log("this is a err msg");
    }
}
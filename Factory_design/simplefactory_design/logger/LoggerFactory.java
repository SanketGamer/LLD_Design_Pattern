package logger;

public class LoggerFactory {

    public static ILogger createLogger(MyLogLevel loglevel){
        switch (loglevel) {
            case DEBUG:
                return new DebugLogger();
            case INFO:
                return new InfoLogger();
                case ERROR:
                    return new ErrLogger();
            default:
                return null;
        }
    }
}